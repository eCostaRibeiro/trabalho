create tablespace trabalho_futebol
  datafile 'trab_fut.dat' size 40m
  online;
/

create user futebol 
  identified by futebol
  default tablespace trabalho_futebol;
/

grant all privileges to futebol;
