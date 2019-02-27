# Controle Curso

Uma solução criada para tornar o gerenciamento de cursos do CLJ uma tarefa mais fácil. Essa iniciativa vem da ideia de aprender a projetar uma API em Java usando Spring. 


Esse projeto é o *backend* da solução e foi construído em Java 1.8 com auxílio do framework Spring e também do MVN para empacotar o projeto e tratar as dependências. 

O projeto é composto por outra entidade de frontend feioqu em Angular 6.

Para clonar o projeto:

    git clone https://github.com/gabriel-inf/curso-controle.git 

Para rodá-lo: 

    ./mvnw clean package && java -jar target/controle-0.0.1-SNAPSHOT.jar



Startando o container do banco:

    docker run --name curso -e MYSQL_ROOT_PASSWORD=cursopass -d mysql:tag

Conectando ao banco por linha de comando:

    docker run -it --link curso:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
