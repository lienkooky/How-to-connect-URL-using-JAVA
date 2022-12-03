package com.practice.connurl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiJson {
	public static void main(String [] args) {
		// 버퍼 이용 : BufferedReader -> 버퍼를 이용해서 읽고 쓰는 함수.
		// 버퍼(Buffer) : 입출력 속도를 향상하기 위해 메모리 영역에 저장.
		// 버퍼 장점 : 버퍼를 이용하기 대문에 입출력 관련 처리작업 빠르게 가능.
		
		BufferedReader br = null;
		
		try {
			// String : 불변(immutable)성을 가짐 -> 매번 새로운 객체를 생성해서 참조하는 방식.
			// StringBuilder : 매번 새로운 객체를 생성하는 것이 아니라 기존 데이터에 값을 추가하는 방식.
			
			String urlStr = "http://apis.data.go.kr/B552061/jaywalking/getRestJaywalking?serviceKey=pO%2FiZd5X0eNFNWyEOKUcR2MYFgOZ%2Bud9als%2BkNiBu6FT5XqvHQ5sK1mW3zgtV%2BGWh%2BaMhfdaMHRzigZ7VtXNcQ%3D%3D&searchYearCd=2015&siDo=11&guGun=320&type=json&numOfRows=10&pageNo=1";
			
			// URL 클래스로 객체 생성 -> 2가지 방법 : 절대경로, 상대경로
			URL url = new URL(urlStr);
			
			// openConnection() 메서드를 이용해서 연결
			// URL 주소의 원격 객체에 접속한 뒤 -> 통신할 수 있는 URLConnection 객체 return.
			HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			
			urlConn.setRequestMethod  ("GET");
			urlConn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + urlConn.getResponseCode()); // 200
			
			// InputStreamReader 클래스로 읽기
			// BufferedReader는 InputstreamReader의 객체를 입력값으로 사용.
			br = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));
			
			// 결과변수 : 돌 때마다 생성
//			String rst = "";
//			String line;
			
//			while((line = br.readLine()) != null) {
//				rst += line + "\n";
//			}
//			System.out.println(rst);

			// 결과변수 : 한번 만들면 기존 데이터에 값 추가
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println("sb" + sb.toString());
			
			// 연결 해제
			br.close();
			urlConn.disconnect();
			
		} catch(Exception err) {
			System.out.println(err.getMessage());
		}
	}
}
