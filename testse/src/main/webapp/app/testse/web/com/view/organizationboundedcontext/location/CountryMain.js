Ext.define('Testse.testse.web.com.view.organizationboundedcontext.location.CountryMain', {
     "extend": "Ext.tab.Panel",
     "customWidgetType": "vdTabLayout",
     "autoScroll": false,
     "controller": "CountryMainController",
     "restURL": "/Country",
     "defaults": {
          "split": true
     },
     "requires": ["Testse.testse.shared.com.model.organizationboundedcontext.location.CountryModel", "Testse.testse.web.com.controller.organizationboundedcontext.location.CountryMainController", "Testse.testse.shared.com.viewmodel.organizationboundedcontext.location.CountryViewModel"],
     "communicationLog": [],
     "tabPosition": "bottom",
     "items": [{
          "title": "Data Browser",
          "layout": "border",
          "defaults": {
               "split": true
          },
          "autoScroll": false,
          "customWidgetType": "vdBorderLayout",
          "items": [{
               "xtype": "tabpanel",
               "customWidgetType": "vdTabLayout",
               "margin": "5 0 5 5",
               "border": 1,
               "style": {
                    "borderColor": "#f6f6f6",
                    "borderStyle": "solid",
                    "borderWidth": "1px"
               },
               "displayName": "Country",
               "name": "CountryTreeContainer",
               "itemId": "CountryTreeContainer",
               "restURL": "/Country",
               "autoScroll": false,
               "collapsible": true,
               "titleCollapse": true,
               "collapseMode": "header",
               "collapsed": false,
               "items": [{
                    "xtype": "treepanel",
                    "customWidgetType": "vdTree",
                    "title": "Browse",
                    "name": "entityTreePanel",
                    "useArrows": true,
                    "rootVisible": false,
                    "itemId": "CountryTree",
                    "listeners": {
                         "select": "treeClick"
                    },
                    "tbar": [{
                         "xtype": "triggerfield",
                         "customWidgetType": "vdTriggerField",
                         "emptyText": "Search",
                         "triggerCls": "",
                         "listeners": {
                              "change": "onTriggerfieldChange",
                              "buffer": 250
                         }
                    }, "->", {
                         "xtype": "tool",
                         "type": "refresh",
                         "tooltip": "Refresh Tree Data",
                         "handler": "onTreeRefreshClick"
                    }]
               }, {
                    "title": "Advance Search",
                    "xtype": "form",
                    "customWidgetType": "vdFormpanel",
                    "itemId": "queryPanel",
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "isDockedItem": true,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill"
                         }, {
                              "xtype": "button",
                              "customWidgetType": "vdButton",
                              "text": "Filter",
                              "name": "filterButton",
                              "handler": "onFilterClick"
                         }]
                    }],
                    "items": [{
                         "name": "countryName",
                         "itemId": "countryName",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Name",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Name",
                         "fieldId": "E2A3CFA0-45B4-4D88-8427-96DD3BCF5B96",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "countryName"
                    }, {
                         "name": "countryCode1",
                         "itemId": "countryCode1",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Code 1",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Code 1",
                         "fieldId": "8FAC9501-103E-4C7D-B6BF-3CB4F06CEDB9",
                         "minLength": "0",
                         "maxLength": "3",
                         "bindable": "countryCode1"
                    }]
               }],
               "region": "west",
               "width": "20%"
          }, {
               "region": "center",
               "layout": "border",
               "defaults": {
                    "split": true
               },
               "customWidgetType": "vdBorderLayout",
               "items": [{
                    "customWidgetType": "vdFormpanel",
                    "viewModel": "CountryViewModel",
                    "xtype": "form",
                    "displayName": "Country",
                    "title": "Country",
                    "name": "Country",
                    "itemId": "CountryForm",
                    "bodyPadding": 10,
                    "items": [{
                         "name": "countryId",
                         "itemId": "countryId",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Country Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Country Code<font color='red'> *<\/font>",
                         "fieldId": "872528B4-DD49-49F8-8CC6-77AAF58A3918",
                         "minLength": "0",
                         "maxLength": "64",
                         "hidden": true,
                         "value": "",
                         "bindable": "countryId",
                         "bind": "{countryId}"
                    }, {
                         "name": "countryName",
                         "itemId": "countryName",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Name",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Name<font color='red'> *<\/font>",
                         "allowBlank": false,
                         "fieldId": "E2A3CFA0-45B4-4D88-8427-96DD3BCF5B96",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "countryName",
                         "bind": "{countryName}",
                         "columnWidth": 0.5
                    }, {
                         "name": "countryCode1",
                         "itemId": "countryCode1",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Code 1",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Code 1",
                         "fieldId": "8FAC9501-103E-4C7D-B6BF-3CB4F06CEDB9",
                         "minLength": "0",
                         "maxLength": "3",
                         "bindable": "countryCode1",
                         "bind": "{countryCode1}",
                         "columnWidth": 0.5
                    }, {
                         "name": "countryCode2",
                         "itemId": "countryCode2",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Code 2",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Code 2",
                         "fieldId": "0B966957-7D41-4843-8F47-6D5BF45480DB",
                         "minLength": "0",
                         "maxLength": "3",
                         "bindable": "countryCode2",
                         "bind": "{countryCode2}",
                         "columnWidth": 0.5
                    }, {
                         "name": "countryFlag",
                         "itemId": "countryFlag",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Flag",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Flag",
                         "fieldId": "E71888FC-8BB0-49D7-9253-8B7CD27D28F1",
                         "minLength": "0",
                         "maxLength": "64",
                         "bindable": "countryFlag",
                         "bind": "{countryFlag}",
                         "columnWidth": 0.5
                    }, {
                         "name": "capital",
                         "itemId": "capital",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Capital",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Capital",
                         "fieldId": "8149BF7E-BAAD-4A37-B41B-EB670B1D68A7",
                         "minLength": "0",
                         "maxLength": "32",
                         "bindable": "capital",
                         "bind": "{capital}",
                         "columnWidth": 0.5
                    }, {
                         "name": "currencyCode",
                         "itemId": "currencyCode",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency Code",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency Code",
                         "fieldId": "3869FDBA-28EB-4562-8119-0BD9E305372D",
                         "minLength": "0",
                         "maxLength": "3",
                         "bindable": "currencyCode",
                         "bind": "{currencyCode}",
                         "columnWidth": 0.5
                    }, {
                         "name": "currencyName",
                         "itemId": "currencyName",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency Name",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency Name",
                         "fieldId": "BBB86B69-E129-42F2-9D41-EEE6B10F1FB1",
                         "minLength": "0",
                         "maxLength": "128",
                         "bindable": "currencyName",
                         "bind": "{currencyName}",
                         "columnWidth": 0.5
                    }, {
                         "name": "currencySymbol",
                         "itemId": "currencySymbol",
                         "xtype": "textfield",
                         "customWidgetType": "vdTextfield",
                         "displayName": "Currency Symbol",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Currency Symbol",
                         "fieldId": "7BBA3D15-76E2-4D34-83F2-73F6859E9AAA",
                         "minLength": "0",
                         "maxLength": "32",
                         "bindable": "currencySymbol",
                         "bind": "{currencySymbol}",
                         "columnWidth": 0.5
                    }, {
                         "name": "capitalLatitude",
                         "itemId": "capitalLatitude",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Capital Latitude",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Capital Latitude",
                         "fieldId": "E0135BA0-4374-47DC-BBF3-AC305D8EF9AE",
                         "minValue": "0",
                         "maxValue": "11",
                         "bindable": "capitalLatitude",
                         "bind": "{capitalLatitude}",
                         "columnWidth": 0.5
                    }, {
                         "name": "capitalLongitude",
                         "itemId": "capitalLongitude",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "Capital Longitude",
                         "margin": "5 5 5 5",
                         "fieldLabel": "Capital Longitude",
                         "fieldId": "49368352-D731-4291-AFB7-66FD8477CF6B",
                         "minValue": "0",
                         "maxValue": "11",
                         "bindable": "capitalLongitude",
                         "bind": "{capitalLongitude}",
                         "columnWidth": 0.5
                    }, {
                         "name": "isoNumeric",
                         "itemId": "isoNumeric",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "ISO Numeric",
                         "margin": "5 5 5 5",
                         "fieldLabel": "ISO Numeric",
                         "fieldId": "0B21347B-C277-4A7B-8A16-9F390A26C669",
                         "minValue": "0",
                         "maxValue": "11",
                         "bindable": "isoNumeric",
                         "bind": "{isoNumeric}",
                         "columnWidth": 0.5
                    }, {
                         "name": "versionId",
                         "itemId": "versionId",
                         "xtype": "numberfield",
                         "customWidgetType": "vdNumberfield",
                         "displayName": "versionId",
                         "margin": "5 5 5 5",
                         "value": "-1",
                         "fieldLabel": "versionId",
                         "fieldId": "72F49D4D-FDCA-4BFC-8ACF-862D3ADE955D",
                         "bindable": "versionId",
                         "bind": "{versionId}",
                         "hidden": true
                    }],
                    "layout": "column",
                    "defaults": {
                         "columnWidth": 0.5,
                         "labelAlign": "left",
                         "labelWidth": 200
                    },
                    "autoScroll": true,
                    "dockedItems": [{
                         "xtype ": "toolbar",
                         "customWidgetType": "vdBBar",
                         "dock": "bottom",
                         "ui": "footer",
                         "isDockedItem": true,
                         "parentId": 1,
                         "customId": 7,
                         "items": [{
                              "xtype": "tbfill",
                              "customWidgetType": "vdTbFill",
                              "parentId": 7,
                              "customId": 718
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "name": "saveFormButton",
                              "margin": "0 5 0 5",
                              "text": "Save",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "saveFormButton",
                              "parentId": 7,
                              "customId": 719,
                              "listeners": {
                                   "click": "saveForm"
                              }
                         }, {
                              "customWidgetType": "vdButton",
                              "xtype": "button",
                              "name": "resetFormButton",
                              "margin": "0 5 0 5",
                              "text": "Reset",
                              "hiddenName": "button",
                              "canHaveParent": false,
                              "itemId": "resetFormButton",
                              "parentId": 7,
                              "customId": 720,
                              "listeners": {
                                   "click": "resetForm"
                              }
                         }],
                         "defaults": {}
                    }],
                    "listeners": {
                         "scope": "controller"
                    },
                    "tools": [{
                         "type": "help",
                         "tooltip": "Console",
                         "handler": "onConsoleClick"
                    }, {
                         "type": "refresh",
                         "tooltip": "Refresh Tab",
                         "handler": "init"
                    }],
                    "extend": "Ext.form.Panel",
                    "region": "center"
               }, {
                    "xtype": "gridpanel",
                    "customWidgetType": "vdGrid",
                    "displayName": "Country",
                    "title": "Details Grid",
                    "name": "CountryGrid",
                    "itemId": "CountryGrid",
                    "restURL": "/Country",
                    "store": [],
                    "bodyPadding": 10,
                    "columns": [{
                         "header": "Country Code",
                         "dataIndex": "countryId",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "primaryDisplay",
                         "dataIndex": "primaryDisplay",
                         "hidden": true
                    }, {
                         "header": "primaryKey",
                         "dataIndex": "primaryKey",
                         "hidden": true
                    }, {
                         "header": "Name",
                         "dataIndex": "countryName",
                         "flex": 1
                    }, {
                         "header": "Code 1",
                         "dataIndex": "countryCode1",
                         "flex": 1
                    }, {
                         "header": "Code 2",
                         "dataIndex": "countryCode2",
                         "flex": 1
                    }, {
                         "header": "Flag",
                         "dataIndex": "countryFlag",
                         "flex": 1
                    }, {
                         "header": "Capital",
                         "dataIndex": "capital",
                         "flex": 1
                    }, {
                         "header": "Currency Code",
                         "dataIndex": "currencyCode",
                         "flex": 1
                    }, {
                         "header": "Currency Name",
                         "dataIndex": "currencyName",
                         "flex": 1
                    }, {
                         "header": "Currency Symbol",
                         "dataIndex": "currencySymbol",
                         "flex": 1
                    }, {
                         "header": "Capital Latitude",
                         "dataIndex": "capitalLatitude",
                         "flex": 1
                    }, {
                         "header": "Capital Longitude",
                         "dataIndex": "capitalLongitude",
                         "flex": 1
                    }, {
                         "header": "ISO Numeric",
                         "dataIndex": "isoNumeric",
                         "flex": 1
                    }, {
                         "header": "createdBy",
                         "dataIndex": "createdBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "createdDate",
                         "dataIndex": "createdDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedBy",
                         "dataIndex": "updatedBy",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "updatedDate",
                         "dataIndex": "updatedDate",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "versionId",
                         "dataIndex": "versionId",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "activeStatus",
                         "dataIndex": "activeStatus",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "header": "txnAccessCode",
                         "dataIndex": "txnAccessCode",
                         "hidden": true,
                         "flex": 1
                    }, {
                         "xtype": "actioncolumn",
                         "customWidgetType": "vdActionColumn",
                         "width": 30,
                         "sortable": false,
                         "menuDisable": true,
                         "items": [{
                              "icon": "images/delete.gif",
                              "tooltip": "Delete Record",
                              "handler": "onDeleteActionColumnClickMainGrid"
                         }]
                    }],
                    "listeners": {
                         "itemclick": "onGridItemClick"
                    },
                    "tools": [{
                         "type": "refresh",
                         "tooltip": "Refresh Grid Data",
                         "handler": "onGridRefreshClick"
                    }],
                    "collapsible": true,
                    "titleCollapse": true,
                    "collapseMode": "header",
                    "region": "south",
                    "height": "40%"
               }]
          }]
     }, {
          "title": "Add New",
          "itemId": "addNewForm",
          "layout": "border",
          "customWidgetType": "vdBorderLayout",
          "autoScroll": false,
          "items": [{
               "customWidgetType": "vdFormpanel",
               "viewModel": "CountryViewModel",
               "xtype": "form",
               "displayName": "Country",
               "title": "Country",
               "name": "Country",
               "itemId": "CountryForm",
               "bodyPadding": 10,
               "items": [{
                    "name": "countryId",
                    "itemId": "countryId",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Country Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Country Code<font color='red'> *<\/font>",
                    "fieldId": "872528B4-DD49-49F8-8CC6-77AAF58A3918",
                    "minLength": "0",
                    "maxLength": "64",
                    "hidden": true,
                    "value": "",
                    "bindable": "countryId",
                    "bind": "{countryId}"
               }, {
                    "name": "countryName",
                    "itemId": "countryName",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Name",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Name<font color='red'> *<\/font>",
                    "allowBlank": false,
                    "fieldId": "E2A3CFA0-45B4-4D88-8427-96DD3BCF5B96",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "countryName",
                    "bind": "{countryName}",
                    "columnWidth": 0.5
               }, {
                    "name": "countryCode1",
                    "itemId": "countryCode1",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Code 1",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Code 1",
                    "fieldId": "8FAC9501-103E-4C7D-B6BF-3CB4F06CEDB9",
                    "minLength": "0",
                    "maxLength": "3",
                    "bindable": "countryCode1",
                    "bind": "{countryCode1}",
                    "columnWidth": 0.5
               }, {
                    "name": "countryCode2",
                    "itemId": "countryCode2",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Code 2",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Code 2",
                    "fieldId": "0B966957-7D41-4843-8F47-6D5BF45480DB",
                    "minLength": "0",
                    "maxLength": "3",
                    "bindable": "countryCode2",
                    "bind": "{countryCode2}",
                    "columnWidth": 0.5
               }, {
                    "name": "countryFlag",
                    "itemId": "countryFlag",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Flag",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Flag",
                    "fieldId": "E71888FC-8BB0-49D7-9253-8B7CD27D28F1",
                    "minLength": "0",
                    "maxLength": "64",
                    "bindable": "countryFlag",
                    "bind": "{countryFlag}",
                    "columnWidth": 0.5
               }, {
                    "name": "capital",
                    "itemId": "capital",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Capital",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Capital",
                    "fieldId": "8149BF7E-BAAD-4A37-B41B-EB670B1D68A7",
                    "minLength": "0",
                    "maxLength": "32",
                    "bindable": "capital",
                    "bind": "{capital}",
                    "columnWidth": 0.5
               }, {
                    "name": "currencyCode",
                    "itemId": "currencyCode",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Currency Code",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Currency Code",
                    "fieldId": "3869FDBA-28EB-4562-8119-0BD9E305372D",
                    "minLength": "0",
                    "maxLength": "3",
                    "bindable": "currencyCode",
                    "bind": "{currencyCode}",
                    "columnWidth": 0.5
               }, {
                    "name": "currencyName",
                    "itemId": "currencyName",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Currency Name",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Currency Name",
                    "fieldId": "BBB86B69-E129-42F2-9D41-EEE6B10F1FB1",
                    "minLength": "0",
                    "maxLength": "128",
                    "bindable": "currencyName",
                    "bind": "{currencyName}",
                    "columnWidth": 0.5
               }, {
                    "name": "currencySymbol",
                    "itemId": "currencySymbol",
                    "xtype": "textfield",
                    "customWidgetType": "vdTextfield",
                    "displayName": "Currency Symbol",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Currency Symbol",
                    "fieldId": "7BBA3D15-76E2-4D34-83F2-73F6859E9AAA",
                    "minLength": "0",
                    "maxLength": "32",
                    "bindable": "currencySymbol",
                    "bind": "{currencySymbol}",
                    "columnWidth": 0.5
               }, {
                    "name": "capitalLatitude",
                    "itemId": "capitalLatitude",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Capital Latitude",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Capital Latitude",
                    "fieldId": "E0135BA0-4374-47DC-BBF3-AC305D8EF9AE",
                    "minValue": "0",
                    "maxValue": "11",
                    "bindable": "capitalLatitude",
                    "bind": "{capitalLatitude}",
                    "columnWidth": 0.5
               }, {
                    "name": "capitalLongitude",
                    "itemId": "capitalLongitude",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "Capital Longitude",
                    "margin": "5 5 5 5",
                    "fieldLabel": "Capital Longitude",
                    "fieldId": "49368352-D731-4291-AFB7-66FD8477CF6B",
                    "minValue": "0",
                    "maxValue": "11",
                    "bindable": "capitalLongitude",
                    "bind": "{capitalLongitude}",
                    "columnWidth": 0.5
               }, {
                    "name": "isoNumeric",
                    "itemId": "isoNumeric",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "ISO Numeric",
                    "margin": "5 5 5 5",
                    "fieldLabel": "ISO Numeric",
                    "fieldId": "0B21347B-C277-4A7B-8A16-9F390A26C669",
                    "minValue": "0",
                    "maxValue": "11",
                    "bindable": "isoNumeric",
                    "bind": "{isoNumeric}",
                    "columnWidth": 0.5
               }, {
                    "name": "versionId",
                    "itemId": "versionId",
                    "xtype": "numberfield",
                    "customWidgetType": "vdNumberfield",
                    "displayName": "versionId",
                    "margin": "5 5 5 5",
                    "value": "-1",
                    "fieldLabel": "versionId",
                    "fieldId": "72F49D4D-FDCA-4BFC-8ACF-862D3ADE955D",
                    "bindable": "versionId",
                    "bind": "{versionId}",
                    "hidden": true
               }],
               "layout": "column",
               "defaults": {
                    "columnWidth": 0.5,
                    "labelAlign": "left",
                    "labelWidth": 200
               },
               "autoScroll": true,
               "dockedItems": [{
                    "xtype ": "toolbar",
                    "customWidgetType": "vdBBar",
                    "dock": "bottom",
                    "ui": "footer",
                    "isDockedItem": true,
                    "parentId": 1,
                    "customId": 7,
                    "items": [{
                         "xtype": "tbfill",
                         "customWidgetType": "vdTbFill",
                         "parentId": 7,
                         "customId": 718
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "name": "saveFormButton",
                         "margin": "0 5 0 5",
                         "text": "Save",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "saveFormButton",
                         "parentId": 7,
                         "customId": 719,
                         "listeners": {
                              "click": "saveForm"
                         }
                    }, {
                         "customWidgetType": "vdButton",
                         "xtype": "button",
                         "name": "resetFormButton",
                         "margin": "0 5 0 5",
                         "text": "Reset",
                         "hiddenName": "button",
                         "canHaveParent": false,
                         "itemId": "resetFormButton",
                         "parentId": 7,
                         "customId": 720,
                         "listeners": {
                              "click": "resetForm"
                         }
                    }],
                    "defaults": {}
               }],
               "listeners": {
                    "scope": "controller"
               },
               "tools": [{
                    "type": "help",
                    "tooltip": "Console",
                    "handler": "onConsoleClick"
               }, {
                    "type": "refresh",
                    "tooltip": "Refresh Tab",
                    "handler": "init"
               }],
               "extend": "Ext.form.Panel",
               "region": "center"
          }]
     }]
});