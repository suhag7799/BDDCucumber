$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/FreeCrmBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title for login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "suhag7799",
        "Winter@2020"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user move to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters deal details title and amount",
  "rows": [
    {
      "cells": [
        "ThanksGiving",
        "200",
        "50",
        "10"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 5575853393,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_for_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 31175860,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 461604932,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 2660497497,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 6686293,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_move_to_new_contact_page()"
});
formatter.result({
  "duration": 1713628623,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_firstname_lastname_position(DataTable)"
});
formatter.result({
  "duration": 2828333811,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 10607057675,
  "status": "passed"
});
});