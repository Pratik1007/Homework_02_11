$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/signup.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Feature",
  "description": "\r\nAs a user I want to Sign Up successfully",
  "id": "signup-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9421443257,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As a user i should navigate to Sign Up page sucessfully",
  "description": "",
  "id": "signup-feature;as-a-user-i-should-navigate-to-sign-up-page-sucessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click On \u0027SignUp\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to \u0027Sign up\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 321315090,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 300666117,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iShouldNavigateToSignUpPage()"
});
formatter.result({
  "duration": 117679732,
  "status": "passed"
});
formatter.after({
  "duration": 688936938,
  "status": "passed"
});
formatter.before({
  "duration": 8542545121,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "As a user i should SignUp successfully",
  "description": "",
  "id": "signup-feature;as-a-user-i-should-signup-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on \u0027SignUp\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on \u0027SignUp with Email\u0027 field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter \u0027First Name\u0027 in first name field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \u0027Last Name\u0027 in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \u0027email\u0027 in email field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \u0027password\u0027 in password field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on \u0027Sign Up\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should Signup successfully and i should see dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepdefs.iAmOnSignUpPage()"
});
formatter.result({
  "duration": 366221549,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpWithEmailField()"
});
formatter.result({
  "duration": 446233602,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterFirstNameInFirstNameField()"
});
formatter.result({
  "duration": 409171857,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterLastNameInLastNameField()"
});
formatter.result({
  "duration": 412025824,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterEmailInEmailField()"
});
formatter.result({
  "duration": 535474246,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iEnterPasswordInPasswordField()"
});
formatter.result({
  "duration": 216598903,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 136411966,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepdefs.iShouldSignupSuccessfullyAndIShouldSeeDashboard()"
});
formatter.result({
  "duration": 2631926165,
  "status": "passed"
});
formatter.after({
  "duration": 789663239,
  "status": "passed"
});
});