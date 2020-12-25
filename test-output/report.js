$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature");
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
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "suhag7799",
        "Winter@2020"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user move to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details title and amount",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "comission"
      ],
      "line": 13
    },
    {
      "cells": [
        "Deal1",
        "200",
        "50",
        "10"
      ],
      "line": 14
    },
    {
      "cells": [
        "Deal2",
        "250",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "Deal3",
        "200",
        "10",
        "5"
      ],
      "line": 16
    },
    {
      "cells": [
        "Deal4",
        "50",
        "5",
        "10"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 5354232244,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_for_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 35175873,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 165269247,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 5406722295,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 11827531,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_move_to_new_deal_page()"
});
formatter.result({
  "duration": 1166538372,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_firstname_lastname_position(DataTable)"
});
formatter.result({
  "duration": 14194301610,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 10599941893,
  "status": "passed"
});
});