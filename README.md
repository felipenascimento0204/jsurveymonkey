# jsurveymonkey
Java library for integration with survey monkey

# Usage

#### Create survey request
```java
		SurveyMonkeyService surveyMonkeyService = new SurveyMonkeyService("API_AUTH_TOKEN");
		
		CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
		createSurveyRequest.setTitle("Survey by integration");
		createSurveyRequest.setNickname("Survey by integration nick");
		createSurveyRequest.setFrom_survey_id(ID_SURVEY_FROM);
		
		CreateSurveyResponse createSurveyResponse = surveyMonkeyService.createSurvey(createSurveyRequest);
```