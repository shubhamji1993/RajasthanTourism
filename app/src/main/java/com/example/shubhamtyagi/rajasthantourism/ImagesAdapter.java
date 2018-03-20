package com.example.shubhamtyagi.rajasthantourism;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Shubham Tyagi on 19-03-2018.
 */

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder> {

    private Context mContext;
    private List<Upload> mUploads;

    public ImagesAdapter(Context context, List<Upload> uploads){
        mContext = context;
        mUploads = uploads;
    }

    @Override
    public ImagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.image_item,parent,false);
        return new ImagesViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ImagesViewHolder holder, int position) {
        Upload uploadCurrent = mUploads.get(position);
        holder.textViewName.setText("Shubham");
        //Glide.with(mContext).load(uploadCurrent.getImageUrl()).dontAnimate().into(holder.imageView);
        Picasso.get()
                .load(uploadCurrent.getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImagesViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public ImageView imageView;
        public ImagesViewHolder(View itemView){
            super(itemView);

            textViewName = itemView.findViewById(R.id.text_view_name);
            imageView = itemView.findViewById(R.id.image_view_upload);
        }
    }
}
