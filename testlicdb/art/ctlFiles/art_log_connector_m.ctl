load data infile '$ART_DATA_PATH/art_log_connector_m.csv' "str '#appfirenewline#'" into table art_log_connector_m FIELDS TERMINATED BY '#appfire#' (connector_id,log_config_id,connector_log_level,cid,id,enabled,connector_name,class_name,system_defined,version_id,created_by,created_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss".0"',updated_by,updated_date TIMESTAMP 'yyyy-mm-dd hh24:mi:ss".0"',active_status)
