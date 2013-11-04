--popula tabela campeonato com o primeiro registro
insert into campeonato values (1, 'teste', '2013');

--popula tabela equipe com dois registros
insert into equipe values (1,'Time1');
insert into equipe values (2, 'Time2');
insert into equipe values (3, 'Time3');
insert into equipe values (4, 'Time4');
insert into equipe values (5, 'Time5');
insert into equipe values (6, 'Time6');

--popula tabela jogador com dois registro para cada equipe
insert into jogador values (1,11,'Jogador11');
insert into jogador values (1,12,'Jogador12');
insert into jogador values (1,13,'Jogador13');
insert into jogador values (1,14,'Jogador14');
insert into jogador values (1,15,'Jogador15');

insert into jogador values (2,21,'Jogador21');
insert into jogador values (2,22,'Jogador22');
insert into jogador values (2,23,'Jogador23');
insert into jogador values (2,24,'Jogador24');
insert into jogador values (2,25,'Jogador25');

insert into jogador values (3,31,'Jogador31');
insert into jogador values (3,32,'Jogador32');
insert into jogador values (3,33,'Jogador33');
insert into jogador values (3,34,'Jogador34');
insert into jogador values (3,35,'Jogador35');

insert into jogador values (4,41,'Jogador41');
insert into jogador values (4,42,'Jogador42');
insert into jogador values (4,43,'Jogador43');
insert into jogador values (4,44,'Jogador44');
insert into jogador values (4,45,'Jogador45');

insert into jogador values (5,51,'Jogador51');
insert into jogador values (5,52,'Jogador52');
insert into jogador values (5,53,'Jogador53');
insert into jogador values (5,54,'Jogador54');
insert into jogador values (5,55,'Jogador55');

insert into jogador values (6,61,'Jogador61');
insert into jogador values (6,62,'Jogador62');
insert into jogador values (6,63,'Jogador63');
insert into jogador values (6,64,'Jogador64');
insert into jogador values (6,65,'Jogador65');


--popula tabela árbitro com 2 registros
insert into arbitro values (1, 'juiz1');
insert into arbitro values (2, 'juiz2');

--popula tabela estadio com dois registros
insert into estadio values (1, 'estadio1');
insert into estadio values (2, 'estadio2');--parei aqui
insert into estadio values (3, 'estadio3');
insert into estadio values (4, 'estadio4');
insert into estadio values (5, 'estadio5');
insert into estadio values (6, 'estadio6');

--popula tabela Jogador_time_campeonato
declare
  vCodigoCampeonato campeonato.codigo%type;
  vCodigoEquipe     equipe.codigo%type;
  vCodigoJogador    jogador.codigo%type;

  cursor codigosTabelas is
    select campeonato.codigo, equipe.codigo, jogador.codigo   
      from jogador, equipe, campeonato
      where jogador.equipe_codigo = equipe.codigo and campeonato.codigo = 1;

begin
  open codigosTabelas;
  
    loop
      fetch codigosTabelas into vCodigoCampeonato, vCodigoEquipe, vCodigoJogador;
      exit when codigosTabelas%notfound;
      insert into jogador_time_campeonato values (vCodigoCampeonato, vCodigoEquipe, vCodigoJogador);
    end loop;
  
  close codigosTabelas;
end;
/

--popula tabela estadio_equipe
declare
  vCodigoEstadio estadio.codigo%type;
  vCodigoEquipe equipe.codigo%type;
  
  cursor EstadioEquipe is
    select estadio.codigo, equipe.codigo
    from estadio, equipe
    where estadio.codigo = equipe.codigo;
    
begin
  open EstadioEquipe;
    
    loop
      fetch EstadioEquipe into vCodigoEstadio, vCodigoEquipe;
      exit when EstadioEquipe%notfound;
      insert into estadio_equipe values (vCodigoEstadio, vCodigoEquipe);
    end loop;
    
  close EstadioEquipe;
end;
/