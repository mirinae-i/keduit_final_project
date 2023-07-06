package com.team2.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class XmlUtilTest {

	@Test
	public void parseXml() {
		try {
			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n" + "<DisasterMsg>\r\n" + "<head>\r\n"
					+ "<totalCount>175950</totalCount>\r\n" + "<numOfRows>2</numOfRows>\r\n" + "<pageNo>1</pageNo>\r\n"
					+ "<type>XML</type>\r\n" + "<RESULT>\r\n" + "<resultCode>INFO-0</resultCode>\r\n"
					+ "<resultMsg>NOMAL SERVICE</resultMsg>\r\n" + "</RESULT>\r\n" + "</head>\r\n" + "<row>\r\n"
					+ "<create_date>2023/07/06 10:08:50</create_date>\r\n"
					+ "<location_id>9450,9455,9467,9468,9470,9480</location_id>\r\n"
					+ "<location_name>경기도 여주시,경기도 여주시,경기도 여주시,경기도 여주시,경기도 여주시,경기도 여주시</location_name>\r\n"
					+ "<md101_sn>196524</md101_sn>\r\n"
					+ "<msg>[여주시] 여주시 여흥동, 오학동 일부지역 정전발생, 한국전력공사에서 복구 중에 있습니다. 시민 여러분은 안전사고 및 차량통행에 유의하시기 바랍니다.</msg>\r\n"
					+ "<send_platform>cbs</send_platform>\r\n" + "</row>\r\n" + "<row>\r\n"
					+ "<create_date>2023/07/05 22:51:41</create_date>\r\n" + "<location_id>17</location_id>\r\n"
					+ "<location_name>강원특별자치도 평창군</location_name>\r\n" + "<md101_sn>196523</md101_sn>\r\n"
					+ "<msg>[평창군청] 도로 통행 금지 해제. 마지삼거리 ~ 입탄삼거리 구간 응급 복구 완료로 통행이 가능하나, 구간 통행 시 주의하여 주시기 바랍니다.</msg>\r\n"
					+ "<send_platform>cbs</send_platform>\r\n" + "</row>\r\n" + "</DisasterMsg>";
			XmlMapper mapper = new XmlMapper();

			JsonNode node = mapper.readTree(xml.getBytes());
			ObjectMapper jsonMapper = new ObjectMapper();
			String json = jsonMapper.writeValueAsString(node);

			log.info("JSON: {}", json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
