Multiple Valid Profiles:
------------------------
If we give multiple profiles like below:

```
spring.profiles.active=dev,qa
```

Then the properties from qa will be loaded.

Multiple Valid Profiles with an Invalid One:
--------------------------------------------

```
spring.profiles.active=dev,qa,prod
```

As prod is not available it will load qa

Spring Profile Property in Profile based Property:
--------------------------------------------------
Suppose you define "spring.profiles.active=qa" in application-dev.properties will result in the below exception:

```
SEVERE: Application run failed
org.springframework.boot.context.config.InvalidConfigDataPropertyException: Property 'spring.profiles.active' imported from location 'class path resource [application-dev.properties]' is invalid in a profile specific resource [origin: class path resource [application-dev.properties] - 1:24]
```

You cannot have this property defined in the profile properties. It should only be in the main application.properties.

