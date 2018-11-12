#### live url: <a href="https://springmvc-app-ranjit.herokuapp.com/user">https://springmvc-app-ranjit.herokuapp.com/user</a>

#### Modules used in this demo app:- 
	java, springBoot, jpa, h2database, theamleaf

#### Required h2 config in spring boot:-
	#h2
	spring.h2.console.enabled= true
	spring.datasource.platform=h2
	spring.h2.console.path=/h2
	#datasource
	spring.datasource.url= jdbc:h2:~/test
	spring.datasource.username= sa
	spring.datasource.password=
	spring.datasource.driver-class-name=org.h2.Driver
##### theamleaf default config:-
	#theamleaf
	spring.thymeleaf.mode=HTML5
	spring.thymeleaf.prefix=classpath:/templates/
	spring.thymeleaf.suffix=.html	
