$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/ApproveReject/AppRej/src/test/java/AppRej/1_COMMUNITY-3.feature");
formatter.feature({
  "line": 3,
  "name": "Blog",
  "description": "",
  "id": "blog",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@COMMUNITY-1035"
    },
    {
      "line": 2,
      "name": "@REQ_COMMUNITY-3"
    }
  ]
});
formatter.before({
  "duration": 14144900100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Tests As an administrator , I want to be able to:"
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#*Acceptance Criteria:*"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "## View all blog posts (new and edited) in my dashboard"
    },
    {
      "line": 10,
      "value": "## Reject/accept a post, by selecting the post and clicking on the"
    },
    {
      "line": 11,
      "value": "#reject/accept button"
    },
    {
      "line": 12,
      "value": "## A prompt (“Your post has been successfully approved and published.“ or “Your post has unfortunately been rejected because it doesn’t conform to the platform rules”) should be shown the user."
    }
  ],
  "line": 14,
  "name": "Approve or reject automation",
  "description": "",
  "id": "blog;approve-or-reject-automation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TEST_COMMUNITY-1049"
    },
    {
      "line": 13,
      "name": "@REQ_COMMUNITY-898"
    },
    {
      "line": 13,
      "name": "@TESTSET_COMMUNITY-1033"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Admin logs in(admin)",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "goes to blog module(admin)",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Admin clicks on approve(admin)",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should receive an approval prompt(admin)",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "if Admin clicks on reject(admin))",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should receive a rejection prompt(admin)",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 692749300,
  "status": "passed"
});
});