package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.services.GetSurveyService;
import junit.framework.TestCase;

public class GetSurveyTest extends TestCase {
	
	public void testGetSurvey(){
		GetSurveyService getSurveyService = new GetSurveyService();
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.requestGetSurvey(new GetSurveyRequest("126921666")).getStatus());
	}

}
