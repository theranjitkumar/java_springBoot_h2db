#### live url: <a href="https://springmvc-app-ranjit.herokuapp.com/user">https://springmvc-app-ranjit.herokuapp.com/user</a>

#### Modules used in this demo app:- 
	java, springBoot, jpa, h2database/mysql, theamleaf

#### Required h2 config:-
	#h2
	spring.h2.console.enabled= true
	spring.datasource.platform=h2
	spring.h2.console.path=/h2
	#datasource
	spring.datasource.url= jdbc:h2:~/test
	spring.datasource.username= sa
	spring.datasource.password=
	spring.datasource.driver-class-name=org.h2.Driver

#### Required mysql config:	
	# msql config
	spring.datasource.url = jdbc:mysql://localhost:3306/springapp?useSSL=false
	spring.datasource.username = root
	spring.datasource.password = 
	spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
	spring.jpa.hibernate.ddl-auto = update
	# msql config end	
	
#####	Note: both h2database and mysql configration added it can be used as want by comment/uncomment each other, default config is h2database 	
	
##### theamleaf default config:-
	#theamleaf
	spring.thymeleaf.mode=HTML5
	spring.thymeleaf.prefix=classpath:/templates/
	spring.thymeleaf.suffix=.html	
