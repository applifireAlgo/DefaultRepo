Ext.define('Testl.testl.shared.com.model.humanresourcecontext.employee.IdProofInformationModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "idCode",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "idDesc",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "idHelp",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "idIcon",
          "type": "string",
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