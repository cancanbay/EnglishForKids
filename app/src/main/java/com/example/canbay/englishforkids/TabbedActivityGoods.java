package com.example.canbay.englishforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TabbedActivityGoods extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */

    static TextView esyaturkce;
    static TextView esyaingilizce;
    static ImageView esyafotografi;
    static ImageButton playbutton;
    static MediaPlayer mpbag;
    static MediaPlayer mperaser;
    static MediaPlayer mpnotebook;
    static MediaPlayer mpmicroscope;
    static MediaPlayer mppencilsharpener;
    static MediaPlayer mpbicycle;
    static MediaPlayer mpcamera;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_goods);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mpbag = MediaPlayer.create(this,R.raw.bag);
        mpbicycle= MediaPlayer.create(this,R.raw.bicycle);
        mpcamera= MediaPlayer.create(this,R.raw.camera);
        mperaser= MediaPlayer.create(this,R.raw.eraser);
        mpmicroscope= MediaPlayer.create(this,R.raw.microscope);
        mpnotebook = MediaPlayer.create(this,R.raw.notebook);
        mppencilsharpener = MediaPlayer.create(this,R.raw.pencil_sharpener);


       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tabbed_activity_goods, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            if(getArguments().getInt(ARG_SECTION_NUMBER) ==1) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpbag.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==2) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Bisiklet");
                esyaingilizce.setText("Bicycle");
                esyafotografi.setImageResource(R.drawable.bicycle);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpbicycle.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==3) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Kamera");
                esyaingilizce.setText("Camera");
                esyafotografi.setImageResource(R.drawable.camera);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpcamera.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==4) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Silgi");
                esyaingilizce.setText("Eraser");
                esyafotografi.setImageResource(R.drawable.eraser);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mperaser.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==5) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Defter");
                esyaingilizce.setText("Notebook");
                esyafotografi.setImageResource(R.drawable.notebook);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpnotebook.start();
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER) ==6) {
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Mikroskop");
                esyaingilizce.setText("Microscope");
                esyafotografi.setImageResource(R.drawable.microscope);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mpmicroscope.start();
                    }
                });
                return rootView;
            }
            else{
                View rootView = inflater.inflate(R.layout.fragment_goods, container, false);
                esyaturkce = (TextView) rootView.findViewById(R.id.esyaturkce);
                esyaingilizce = (TextView) rootView.findViewById(R.id.esyaingilizce);
                esyafotografi = (ImageView) rootView.findViewById(R.id.esyafotografi);
                esyaturkce.setText("Kalemtıraş");
                esyaingilizce.setText("Pencil Sharpener");
                esyafotografi.setImageResource(R.drawable.pencilsharpener);
                playbutton = (ImageButton) rootView.findViewById(R.id.playbutton);
                playbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mppencilsharpener.start();
                    }
                });
                return rootView;
            }
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}
