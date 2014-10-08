package braingames.informatique.cgmatane.cq.ca.braingames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class MyActivity extends Activity {

    /** Déclaration de tout les attributs **/

    public FrameLayout jeu_1_frame;
    public FrameLayout jeu_2_frame;
    public FrameLayout jeu_3_frame;

    public FrameLayout score_frame;
    public FrameLayout option_frame;
    public FrameLayout about_frame;

    private Button jeu_1_button;
    private Button jeu_1_1;
    private Button jeu_1_2;
    private Button jeu_1_3;

    private Button jeu_2_button;
    private Button jeu_2_1;
    private Button jeu_2_2;
    private Button jeu_2_3;

    private Button jeu_3_button;
    private Button jeu_3_1;
    private Button jeu_3_2;
    private Button jeu_3_3;


    public Button score_button;
    public Button option_button;
    public Button about_button;

    private LinearLayout jeu_1_sub;
    private LinearLayout jeu_2_sub;
    private LinearLayout jeu_3_sub;


    private LinearLayout about_sub;

    public Animation menu_appear;
    public Animation menu_dissappear;
    public Animation wizz;
    public Animation slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cacherActionBar();  // cache la barre de menu

        setContentView(R.layout.activity_my);

        initAttr();  // instancie tout les attributs
        setListeners();  // demare tout les listeners
    } //onCreate

    private void cacherActionBar() {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();

    } //hideActionBar

    private void initAttr() {

        jeu_1_frame = (FrameLayout) findViewById(R.id.jeu_1_frame);
        jeu_2_frame = (FrameLayout) findViewById(R.id.jeu_2_frame);
        jeu_3_frame = (FrameLayout) findViewById(R.id.jeu_3_frame);
        score_frame = (FrameLayout) findViewById(R.id.score_frame);
        option_frame = (FrameLayout) findViewById(R.id.options_frame);
        about_frame = (FrameLayout) findViewById(R.id.about_frame);

        jeu_1_button = (Button) findViewById(R.id.jeu_1_button);
        jeu_1_1 = (Button) findViewById(R.id.jeu_1_10);
        jeu_1_2 = (Button) findViewById(R.id.jeu_1_20);
        jeu_1_3 = (Button) findViewById(R.id.jeu_1_30);

        jeu_2_button = (Button) findViewById(R.id.jeu_2_button);
        jeu_2_1 = (Button) findViewById(R.id.jeu_2_1);
        jeu_2_2 = (Button) findViewById(R.id.jeu_2_2);
        jeu_2_3 = (Button) findViewById(R.id.jeu_2_3);

        jeu_3_button = (Button) findViewById(R.id.jeu_3_button);
        jeu_3_1 = (Button) findViewById(R.id.jeu_3_1);
        jeu_3_2 = (Button) findViewById(R.id.jeu_3_2);
        jeu_3_3 = (Button) findViewById(R.id.jeu_3_3);

        score_button = (Button) findViewById(R.id.score_button);
        option_button = (Button) findViewById(R.id.options_button);
        about_button = (Button) findViewById(R.id.about_button);

        jeu_1_sub = (LinearLayout) findViewById(R.id.jeu_1_sub_frame);
        jeu_2_sub = (LinearLayout) findViewById(R.id.jeu_2_sub_frame);
        jeu_3_sub = (LinearLayout) findViewById(R.id.jeu_3_sub_frame);
        about_sub = (LinearLayout) findViewById(R.id.about_sub_frame);

        menu_appear = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.menu_appear);
        menu_dissappear = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_dissappear);
        wizz = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.wizz);
        slide = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);

    } //initAttr

    private void setListeners() {

        jeu_1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /** on anime les boutons **/
                jeu_2_sub.setVisibility(View.GONE);
                jeu_2_button.setVisibility(View.VISIBLE);

                jeu_3_sub.setVisibility(View.GONE);
                jeu_3_button.setVisibility(View.VISIBLE);

                jeu_1_button.setVisibility(View.GONE);
                jeu_1_sub.setVisibility(View.VISIBLE);
                jeu_1_sub.startAnimation(menu_appear);

            }
        });

        jeu_2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /** on anime les boutons **/
                jeu_1_sub.setVisibility(View.GONE);
                jeu_1_button.setVisibility(View.VISIBLE);

                jeu_3_sub.setVisibility(View.GONE);
                jeu_3_button.setVisibility(View.VISIBLE);

                jeu_2_button.setVisibility(View.GONE);
                jeu_2_sub.setVisibility(View.VISIBLE);
                jeu_2_sub.startAnimation(menu_appear);

            }
        });


        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO  implémeter l'activité about (un deuxième menu)
            }
        });

        jeu_1_1.setOnClickListener(jeu_1_ButtonListener);
        jeu_1_2.setOnClickListener(jeu_1_ButtonListener);
        jeu_1_3.setOnClickListener(jeu_1_ButtonListener);

        jeu_2_1.setOnClickListener(jeu_2_ButtonListener);
        jeu_2_2.setOnClickListener(jeu_2_ButtonListener);
        jeu_2_3.setOnClickListener(jeu_2_ButtonListener);

        jeu_3_1.setOnClickListener(jeu_3_ButtonListener);
        jeu_3_2.setOnClickListener(jeu_3_ButtonListener);
        jeu_3_3.setOnClickListener(jeu_3_ButtonListener);

    } //SetListeners


    View.OnClickListener jeu_1_ButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v.getId() == jeu_1_1.getId()){
                jeu_1_1.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_1_1.setOnClickListener(null);
                    }


                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent jeu1Intent = new Intent(MyActivity.this,JeuNombres.class);
                        startActivity(jeu1Intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 1
            }else if (v.getId() == jeu_1_2.getId()) {
                jeu_1_2.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_1_2.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter l'activité du jeu 1
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 1
            }else if (v.getId() == jeu_1_3.getId()){
                jeu_1_3.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_1_3.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter l'activité du jeu 1
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 1
            }
        }
    };

    View.OnClickListener jeu_2_ButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == jeu_2_1.getId()){
                jeu_2_1.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_2_1.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 2
            }else if (v.getId() == jeu_2_2.getId()) {
                jeu_2_2.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_2_2.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                }); //TODO implémenter le jeu 2
            }else if (v.getId() == jeu_2_3.getId()){
                jeu_2_3.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_2_3.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 2

            }

        }
    };

    View.OnClickListener jeu_3_ButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == jeu_3_1.getId()){
                jeu_3_1.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_3_1.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 3
            }else if (v.getId() == jeu_3_2.getId()) {
                jeu_3_2.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_3_2.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 3
            }else if (v.getId() == jeu_3_3.getId()){
                jeu_3_3.startAnimation(wizz);
                wizz.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        jeu_3_3.setOnClickListener(null);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //TODO implémenter le jeu 2
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });  //TODO implémenter le jeu 3

            }

        }
    };

    /** lors du retour vers cette activité, cette fonction est appellé **/
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        restartMenu();
    }

    /** pour reprendre le menu, on pourrais en avoir besoin par la suite **/
    private void restartMenu() {
        jeu_1_sub.setVisibility(View.GONE);
        jeu_2_sub.setVisibility(View.GONE);
        about_sub.setVisibility(View.GONE);
    }


}
