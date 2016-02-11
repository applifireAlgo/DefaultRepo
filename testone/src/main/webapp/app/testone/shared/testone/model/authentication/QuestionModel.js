Ext.define('Testone.testone.shared.testone.model.authentication.QuestionModel', {
     "extend": "Ext.data.Model",
     "fields": [{
          "name": "primaryKey",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "questionId",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "levelid",
          "type": "int",
          "defaultValue": ""
     }, {
          "name": "question",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "questionDetails",
          "type": "string",
          "defaultValue": ""
     }, {
          "name": "questionIcon",
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