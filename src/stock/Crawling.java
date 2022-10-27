package stock;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) throws IOException {
	
		
		
		
		Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=000660" ).get();
		
		Elements name = doc.getElementsByAttributeValue("class", "wrap_company");
		System.out.println("회사명: " +  name.get(0).getElementsByAttributeValue("href", "#").text());
		
		Elements el = doc.getElementsByAttributeValue("class", "no_today");
		System.out.println("현재가: " + el.get(0).getElementsByAttributeValue("class", "blind").text() + "원");
		
		Elements el1 = doc.getElementsByAttributeValue("id", "_market_sum");
		System.out.println("시가총액 : " + el1.get(0).text() + "억원");
		
		Elements el2 = doc.select("#tab_con1 > div.first > table > tbody > tr:nth-child(3) > td > em");
		System.out.println("상장주식수 = " + el2.get(0).text());
		
		Elements per = doc.getElementsByAttributeValue("id", "_per");
		System.out.println("PER = " + per.get(0).text());
		
		Elements pbr = doc.select("#_pbr");
		System.out.println("PBR = " + pbr.get(0).text());
		
		Elements roe = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(6) > td:nth-child(10)");
		System.out.println("ROE = " + roe.get(0).text());
		
		Elements mae = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(1)");
		System.out.println("매출액 = " + mae.get(0).text());
		
		Elements cell = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(2)");
		System.out.println("영업이익 = " + cell.get(0).text());
		
		Elements dc = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3)");
		System.out.println("당기순이익 = " + dc.get(0).text());
		
		Elements cellp = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(4)");
		System.out.println("영업이익률 = " + cellp.get(0).text());
		
		Elements rcell = doc.select("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(5)");
		System.out.println("순이익률 = " + rcell.get(0).text());
		
		
		
	}

}
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(5) > td:nth-child(3)")
///document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(5)")
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(5) > th")
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(4) > th")
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > th")
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > th")
//document.querySelector("#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(2) > th")