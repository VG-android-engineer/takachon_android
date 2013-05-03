package com.daybysay.helloproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

import android.util.Log;

public class HttpConnection {
	private HttpURLConnection _httpcon;
	private URL _url;
	
	public HttpConnection() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public JSONObject getKiminotowaJson() throws IOException {
		_httpcon = (HttpURLConnection)_url.openConnection();
		_httpcon.setRequestMethod("GET");
		// リダイレクトを自動で許可しない設定
		_httpcon.setInstanceFollowRedirects(false);
		// ヘッダーの設定(複数設定可能)
		_httpcon.setRequestProperty("Accept-Language", "jp");
		_httpcon.connect();
		Map headers = _httpcon.getHeaderFields();
		Iterator ite = headers.keySet().iterator();
		while (ite.hasNext()) {
			Log.d("aaa", "a");
		}
		return null;
	}

	public URL getUrl() {
		return _url;
	}

	public void setUrl(URL url) {
		this._url = url;
	}
}
