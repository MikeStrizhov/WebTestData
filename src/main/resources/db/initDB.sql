DROP TABLE IF EXISTS test_run;
DROP TABLE IF EXISTS data_send;
DROP TABLE IF EXISTS data_received;
DROP TABLE IF EXISTS jnd_test_rec;

CREATE TABLE test_run
(
  id               INTEGER PRIMARY KEY     auto_increment,
  name             VARCHAR                 NOT NULL,
  start_time       TIMESTAMP DEFAULT now() NOT NULL,
);

CREATE TABLE data_send
(
  id               INTEGER PRIMARY KEY     auto_increment,
  text             VARCHAR                 NOT NULL,
  FOREIGN KEY (test_id) REFERENCES test_run (id) ON DELETE CASCADE
);

CREATE TABLE data_received
(
  id               INTEGER PRIMARY KEY     auto_increment,
  text             VARCHAR                 NOT NULL,
);

CREATE TABLE jnd_test_rec (
  FOREIGN KEY (test_fk)   REFERENCES test_run (id)
  FOREIGN KEY (reived_fk) REFERENCES data_received (id)
);