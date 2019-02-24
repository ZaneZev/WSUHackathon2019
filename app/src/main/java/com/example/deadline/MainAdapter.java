package com.example.deadline;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainAdapter extends RecyclerView.Adapter{
    private List<Quest> Questies;

    public MainAdapter(List<Quest> Questies){this.Questies=Questies;}
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(i,viewGroup,false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((mViewHolder) viewHolder).bindData(Questies.get(i));
    }

    @Override
    public int getItemCount() {
        return Questies.size();
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
        private Button Stats;
        //private Button Tasks;



        public mViewHolder(final View itemView){
            super(itemView);
            Quest = (TextView)itemView.findViewById(R.id.QuestName);
            Level = (TextView)itemView.findViewById(R.id.Level);
            Pts = (TextView)itemView.findViewById(R.id.Points);
            Prgs = (ProgressBar) itemView.findViewById(R.id.Progress);
            Stats = (Button)itemView.findViewById(R.id.Stats);


        }
        public void bindData(final Quest viewModel){
            Quest.setText((viewModel.getQuestName()));
            int tmpLvl=0;
            String tmpLvlName = "Null Lvl.";
            int tmpPntsUp = 0;
            int tmpPntsLow = 0;
            for(Level i :viewModel.getLevels()){
                if(i.getPointsNeededtoLevelUp()<=viewModel.getTotalNumberOfPoints()){
                    tmpLvl=i.getLevelNumber();
                    tmpPntsLow = i.getPointsNeededtoLevelUp();
                    tmpLvlName = i.getLevelName();
                }
            }
            try{
                tmpPntsUp = viewModel.getLevels().get(tmpLvl+1).getPointsNeededtoLevelUp();
            }catch (Exception E){}
            Level.setText(tmpLvlName);
            Level.setText(("lvl.0"));//TODO!!!!!
            Pts.setText((""+viewModel.getTotalNumberOfPoints()+" pts."));
            Prgs.setMin(tmpPntsLow);
            Prgs.setMax(tmpPntsUp);
            Prgs.setProgress(viewModel.getTotalNumberOfPoints());
            Stats.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("PRESED " + String.valueOf(getAdapterPosition()));

                }
            });
        }
    }
}