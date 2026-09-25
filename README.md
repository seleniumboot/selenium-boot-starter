# Selenium Boot Starter

A ready-to-run [Selenium Boot](https://seleniumboot.com) project: Maven, TestNG, one config file, a page object, and two passing tests. Click **Use this template**, clone, run.

## Run it

```bash
mvn test
```

Needs Java 17+, Maven 3.8+, and Chrome (or Firefox). No driver setup — Selenium Manager handles it. The HTML report lands at `target/selenium-boot-report.html`.

## What's here

```
├── pom.xml                       # one dependency: selenium-boot
├── selenium-boot.yml             # browser, baseUrl, retry, timeouts — all optional
├── testng.xml                    # suite: runs everything in com.example.tests
└── src/test/java/com/example/
    ├── pages/ExamplePage.java    # page object on BasePage (wait-backed click/type/getText)
    └── tests/SmokeTest.java      # a locator-style test and a page-object test
```

## Make it yours

1. Set `execution.baseUrl` in `selenium-boot.yml` to your app.
2. Replace `ExamplePage` and `SmokeTest` with your own pages and tests.
3. Rename the `com.example` package and the `groupId` in `pom.xml`.

Try `mvn test -Dbrowser=firefox`, or set `headless: false` to watch it run.

## Learn more

- [Getting started](https://docs.seleniumboot.com/docs/getting-started)
- [Configuration reference](https://docs.seleniumboot.com/docs/configuration)
- [BasePage guide](https://docs.seleniumboot.com/docs/guides/base-page)

Apache-2.0.
