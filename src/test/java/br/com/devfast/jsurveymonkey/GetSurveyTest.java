package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.services.SurveyService;
import junit.framework.TestCase;

public class GetSurveyTest extends TestCase {
	
	private static String AUTH_TOKEN = "qLLweiVjPPT0wXlE8bsrVlcHrzDr.voUtps3A2uW3KKIOsW2SXtxcjc-StFt.Pd0TMdntO7OhoFu.wU0p-o-7jgstknbTRpvvliFBUIXEWtunlqesjJsCdp-r.ysDvvp";
	private static String SURVEY_ID = "126999467";
	
	public void testGetSurvey(){
		SurveyService getSurveyService = new SurveyService();
		GetSurveyRequest getSurveyRequest = new GetSurveyRequest(SURVEY_ID);
		getSurveyRequest.setAuthenticationToken(AUTH_TOKEN);
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.getSurvey(getSurveyRequest).getResponseStatus());
	}

}
