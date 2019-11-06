$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage feature",
  "description": "\r\nAs a user i want to verify Homepage features",
  "id": "homepage-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User Should be able to click on dropdown features on homepage successfully",
  "description": "",
  "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage of GMx.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on dropdown \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to navigate to \"\u003ccategory\u003e\" page successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;",
  "rows": [
    {
      "cells": [
        "category"
      ],
      "line": 10,
      "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;1"
    },
    {
      "cells": [
        "Free Email"
      ],
      "line": 11,
      "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;2"
    },
    {
      "cells": [
        "Features"
      ],
      "line": 12,
      "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;3"
    },
    {
      "cells": [
        "Apps"
      ],
      "line": 13,
      "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16455639540,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Should be able to click on dropdown features on homepage successfully",
  "description": "",
  "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage of GMx.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on dropdown \"Free Email\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to navigate to \"Free Email\" page successfully",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepdefs.iAmOnHomepageOfGMxCom()"
});
formatter.result({
  "duration": 3770074650,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Email",
      "offset": 21
    }
  ],
  "location": "HomepageStepdefs.iClickOnDropdown(String)"
});
formatter.result({
  "duration": 1997179697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Email",
      "offset": 33
    }
  ],
  "location": "HomepageStepdefs.iShouldBeAbleToNavigateToPageSuccessfully(String)"
});
formatter.result({
  "duration": 68341662,
  "status": "passed"
});
formatter.after({
  "duration": 768992507,
  "status": "passed"
});
formatter.before({
  "duration": 19555077203,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Should be able to click on dropdown features on homepage successfully",
  "description": "",
  "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage of GMx.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on dropdown \"Features\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to navigate to \"Features\" page successfully",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepdefs.iAmOnHomepageOfGMxCom()"
});
formatter.result({
  "duration": 86818139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Features",
      "offset": 21
    }
  ],
  "location": "HomepageStepdefs.iClickOnDropdown(String)"
});
formatter.result({
  "duration": 1657788389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Features",
      "offset": 33
    }
  ],
  "location": "HomepageStepdefs.iShouldBeAbleToNavigateToPageSuccessfully(String)"
});
formatter.result({
  "duration": 69406151,
  "status": "passed"
});
formatter.after({
  "duration": 771288160,
  "status": "passed"
});
formatter.before({
  "duration": 12833464564,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Should be able to click on dropdown features on homepage successfully",
  "description": "",
  "id": "homepage-feature;user-should-be-able-to-click-on-dropdown-features-on-homepage-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage of GMx.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on dropdown \"Apps\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to navigate to \"Apps\" page successfully",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepdefs.iAmOnHomepageOfGMxCom()"
});
formatter.result({
  "duration": 271329624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apps",
      "offset": 21
    }
  ],
  "location": "HomepageStepdefs.iClickOnDropdown(String)"
});
formatter.result({
  "duration": 589876136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apps",
      "offset": 33
    }
  ],
  "location": "HomepageStepdefs.iShouldBeAbleToNavigateToPageSuccessfully(String)"
});
formatter.result({
  "duration": 140454401,
  "status": "passed"
});
formatter.after({
  "duration": 1393506651,
  "status": "passed"
});
});