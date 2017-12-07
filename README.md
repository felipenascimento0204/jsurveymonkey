# jsurveymonkey
Java library for integration with SurveyMonkey
Biblioteca Java para integração com SurveyMonkey
Biblioteca Java para la integración con SurveyMonkey

# Available Services
- [X] Create a Survey
- [x] Get a Survey
- [x] Modify a Survey
- [x] Create Collector
- [X] Create Message
- [X] Add Recipient
- [X] Send Message
- [ ] Delete a Survey
- [ ] Add Question
- [ ] Get Response
- [ ] Get Response Detail
- [ ] Get Survey Trends

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
```