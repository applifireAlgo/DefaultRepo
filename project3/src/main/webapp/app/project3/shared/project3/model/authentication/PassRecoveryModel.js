Ext.define('Project3.project3.shared.project3.model.authentication.PassRecoveryModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "passRecoveryId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "questionid",
          "reference": "Question",
          "defaultValue": ""
     }, {
          "name": "answer",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "versionId",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "User",
          "reference": "UserModel"
     }, {
          "name": "entityAudit",
          "reference": "EntityAudit"
     }, {
          "name": "primaryDisplay",
          "type": "string",
          "defaultValue": ""
     }]
});