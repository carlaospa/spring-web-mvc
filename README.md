# O que � Spring

## Spring Framework

+ Complemento ao Java EE. N�o � uma implmenta��o. Integra��o com algumas especifica��es
+ Container de Invers�o de Controle - Inversion of Control (IoC)
+ Inje��o de Depend�ncia - dependency injection (DI) : @Autowired	
+ Spring Beans : <bean/>  @Bean : Um Objeto que ser� gerenciado pelo IoC Container
+ org.springframework.context.ApplicationContext : Representa IoC container e � responsavel instanciar, configurar e cosntruir esses beans.
+ 5.0.6
+ Spring?s Aspect-Oriented Programming (AOP)
+ Spring Web MVC 
+ Spring WebFlux ^5.0 
	- http://www.reactive-streams.org - SPEC (https://github.com/reactive-streams/reactive-streams-jvm)

	+ http://projectreactor.io - IMPL (Reactor is a Reactive Streams library)
	+ http://reactivex.io - IMPL (https://github.com/ReactiveX/RxJava)

+ https://spring.io/projects/spring-framework#learn
+ https://docs.spring.io/spring/docs/current/spring-framework-reference/overview.html
+ https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html

## Spring Boot

+ Conven��o sobre Configura��o.
+ Auto configura��es por padr�o.
+ Pronto para Produ��o (you can "just run").
+ N�o � um gerador de c�digo.
+ Plug-and-play de modulos starters
+ Tomcat, Jetty ou Undertow embedado
+ 2.0.3

	+ https://spring.io/projects/spring-boot
	+ https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/


## Spring Web MVC

+ MVC - Model, View and Controller

	+ View = https://www.thymeleaf.org/

+ Start.io = Web e Thymeleaf

+ @Controller
+ @Repository
+ @Service
+ ModelAndView VS Model
+ EL ${}

FONTE DIGITAL INNOVATION