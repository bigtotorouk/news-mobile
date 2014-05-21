package com.example.news_android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bigtotoro.xlist.PageAdapter;
import com.bigtotoro.xlist.model.Article;
import com.example.news_android.R;
import com.totoro.freelancer.sdk.view.SquareImageView;
/**
 * 新闻列表数据适配器
 * @author bing
 */
public class ArticleAdapter extends PageAdapter<Article> {
	public Context context;
	
	public ArticleAdapter(Context context){
		this.context = context;
	}
	
	@Override
	public View getItemView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder ;
		if(convertView==null){
			holder = new ViewHolder();
			LayoutInflater inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflate.inflate(R.layout.item_frag_hot, null);
			holder.img = (SquareImageView)convertView.findViewById(R.id.img);
			holder.title = (TextView)convertView.findViewById(R.id.title);
			holder.content = (TextView)convertView.findViewById(R.id.content);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
		Article article = objects.get(position);
		//imageLoader.DisplayImage(Constants.IMAGE_AVATAR+user.getThumb_avatar(), holder.img);
		holder.title.setText("");
		
		return convertView;
	}
	
	static class ViewHolder{
		SquareImageView img;	//author of the beat
		TextView title, content;
	}
}
