# TheBus Telemetry API for Java
This library provides an API for the telemetry rest api of TheBus. 
It allows to retrieve ingame information in an external java application.

## Disclaimer
This project is not affiliated or connected with TML-Studios. This project is completely 3th party.

## Table of Content:

 - [Dependency](#dependency)
   - [Maven](#maven)
   - [Gradle](#gradle)
 - [Api Usage](#api-usage)

## Dependency
### Maven
```xml
<repository>
  <id>flammenfuchs-repo-public</id>
  <name>Flammenfuchs_YT's Repository</name>
  <url>https://repo.flammenfuchs.de/public</url>
</repository>
```
```xml
<dependency>
    <groupId>de.flammenfuchs</groupId>
    <artifactId>thebus-telemetryapi</artifactId>
    <version>1.0.0-ea2.3</version>
</dependency>
```
### Gradle
```
maven {
	url "https://repo.flammenfuchs.de/public"
}
```
```
implementation("de.flammenfuchs:thebus-telemetryapi:1.0.0-ea2.3")
```
## Api Usage
How to get the api:
```
TelemetryApi api = TelemetryApi.getInstance();
```
How to check the availability of the api:
```
api.isAvailable();
```
All requests to the telemetry api are cached.
To access the cache
```
Cache cache = api.getCache();
```
You can force to update all values in the cache at ones
```
cache.update();
```