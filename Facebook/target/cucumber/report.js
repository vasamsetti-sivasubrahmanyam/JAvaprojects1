$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Annotation\annotation.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    },
    {
      "line": 4,
      "value": "#Scenario with AND"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "annotation.enterUsername(String)"
});
formatter.result({
  "duration": 81339513,
  "error_message": "java.lang.NullPointerException\r\n\tat Annotation.annotation.enterUsername(annotation.java:21)\r\n\tat ✽.When I enter username as \"TOM\"(Annotation\\annotation.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "annotation.enterPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "annotation.checkFail()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#Scenario with BUT"
    }
  ],
  "line": 11,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Relogin option should be available",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "annotation.enterUsername(String)"
});
formatter.result({
  "duration": 146570,
  "error_message": "java.lang.NullPointerException\r\n\tat Annotation.annotation.enterUsername(annotation.java:21)\r\n\tat ✽.When I enter username as \"TOM\"(Annotation\\annotation.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "annotation.enterPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "annotation.checkFail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "annotation.checkRelogin()"
});
formatter.result({
  "status": "skipped"
});
});