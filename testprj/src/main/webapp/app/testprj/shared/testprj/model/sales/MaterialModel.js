Ext.define('Testprj.testprj.shared.testprj.model.sales.MaterialModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "materialcode",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "materialdesc",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "brandcode",
          "reference": "Brand",
          "defaultValue": ""
     }, {
          "name": "versionId",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "entityAudit",
          "reference": "EntityAudit"
     }, {
          "name": "primaryDisplay",
          "type": "string",
          "defaultValue": ""
     }]
});