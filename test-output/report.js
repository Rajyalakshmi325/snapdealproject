$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Feature/Search.feature");
formatter.feature({
  "line": 1,
  "name": "enter snapdeal url",
  "description": "",
  "id": "enter-snapdeal-url",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "enter the url",
  "description": "",
  "id": "enter-snapdeal-url;enter-the-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the url",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "get the title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "search bar should enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User search for a product",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on that product page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.open_the_browser()"
});
formatter.result({
  "duration": 12561347900,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.enter_the_url()"
});
formatter.result({
  "duration": 7474632300,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.get_the_title_of_the_page()"
});
formatter.result({
  "duration": 129546000,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.search_bar_should_enabled()"
});
formatter.result({
  "duration": 98465300,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_search_for_a_product()"
});
formatter.result({
  "duration": 3393971100,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.user_is_on_that_product_page()"
});
formatter.result({
  "duration": 2010553000,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 421602700,
  "status": "passed"
});
});