Ext.define('Hrapp.view.databrowsercalendar.DBCalendar', {
	extend : 'Hrapp.view.databrowsercalendar.DBCalendarView',
	requires : [ 'Hrapp.view.databrowsercalendar.DBCalendarController',
	             'Hrapp.view.databrowsercalendar.DBCalendarView','Ext.layout.container.Card',
	             'Ext.calendar.view.Day', 'Ext.calendar.view.Week',
	             'Ext.calendar.view.Month',
	             'Ext.calendar.form.EventDetails',
	             'Ext.calendar.data.EventMappings'],
	controller : 'databrowsercalendar',
	items : [],
	listeners : {
		afterrender : 'loadData',
		scope : "controller"
	}
});
