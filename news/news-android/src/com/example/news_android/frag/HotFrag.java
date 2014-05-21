package com.example.news_android.frag;

import java.util.Map;

import com.bigtotoro.xlist.BasicPageResponse;
import com.bigtotoro.xlist.PageAdapter;
import com.bigtotoro.xlist.PageListFragment;
import com.bigtotoro.xlist.model.Article;
import com.bigtotoro.xlist.model.ArticleResponse;
import com.example.news_android.R;
import com.example.news_android.adapter.ArticleAdapter;
import com.google.gson.Gson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HotFrag extends PageListFragment<Article> {

	@Override
	public void initParams(Map<String, Object> paramMaps,
			PageAdapter<Article> _pageAdapter) {
		url = "";
		_pageAdapter = new ArticleAdapter(getActivity());
	}

	@Override
	public View onCreatePageView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_hot, container, false);
		return view;
	}

	@Override
	public BasicPageResponse<Article> parseResponse(String content) {
		Gson gson = new Gson();
		return gson.fromJson(content, ArticleResponse.class);
	}

}
