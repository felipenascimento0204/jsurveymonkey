# jsurveymonkey
Java library for integration with survey monkey

# Usage

#### Init a SurveyMonkey service
```java
SurveyMonkeyService surveyMonkeyService = new SurveyMonkeyService(API_AUTH_TOKEN);
```

#### Create survey request
```java
CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
createSurveyRequest.setTitle("Survey by integration");
createSurveyRequest.setNickname("Survey by integration nick");

CreateSurveyResponse createSurveyResponse = surveyMonkeyService.createSurvey(createSurveyRequest);
```

#### Get a survey request
```java
GetSurveyRequest getSurveyRequest = new GetSurveyRequest("ID_SURVEY");
GetSurveyResponse getSurveyResponse = surveyMonkeyService.getSurvey(getSurveyRequest);
SurveyPrinter.print(getSurveyResponse);
```