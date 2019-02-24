package com.example.deadline;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainAdapter extends RecyclerView.Adapter{

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(i,viewGroup,false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((mViewHolder) viewHolder).bindData(models.get(i));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
    @Override
    public int getItemViewType(final int i){
        return R.layout.mainblock;
    }
    public class mViewHolder extends RecyclerView.ViewHolder{
        private TextView Quest;
        private TextView Level;
        private TextView Pts;
        private ProgressBar Prgs;
        public mViewHolder(final View itemView){
            super(itemView);
            Quest = (TextView)itemView.findViewById(R.id.QuestName);
            Level = (TextView)itemView.findViewById(R.id.Level);
            Pts = (TextView)itemView.findViewById(R.id.Points);
            Prgs = (ProgressBar) itemView.findViewById(R.id.Progress);

        }
        public void bindData(final Quest viewModel){
            Quest.setText((viewModel.getQuestName()));
            Level.setText(("lvl.0"));//TODO!!!!!
            Pts.setText(());
        }
    }
}