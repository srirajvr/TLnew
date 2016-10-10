package srirajvr.tlnew;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            Intent lineDetails = new Intent(this,linedetails.class);
            startActivity(lineDetails);
        } else if (id == R.id.nav_gallery) {

            Intent crossings = new Intent(this,crossings.class);
            startActivity(crossings);

        } else if (id == R.id.nav_slideshow) {
            Intent dist = new Intent(this,DistanceActivity.class);
            startActivity(dist);

        }

        else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void detailsFind(View v){

        EditText locText = (EditText) findViewById(R.id.LocText);
        String locTex = locText.getText().toString();

        if(TextUtils.isEmpty(locTex)){

            Toast.makeText(getApplicationContext(), "Enter a valid Location", Toast.LENGTH_LONG).show();
        }
        else {

            String locInt = locText.getText().toString();

            Intent details = new Intent(this, detailActivity.class);
            details.putExtra("location", locInt);
            startActivity(details);
        }
    }


    public void LocationFind(View view){

        EditText locText = (EditText) findViewById(R.id.LocText);
        String locTex = locText.getText().toString();

        if(TextUtils.isEmpty(locTex)){
            Toast.makeText(getApplicationContext(),"Enter a valid Location",Toast.LENGTH_LONG).show();
        }
        else{

            int locInt = Integer.parseInt(locText.getText().toString());

            Uri loc = Uri.parse("geo:0,0?q=16.6331,74.3620055555556(Location 1)");

            if (0 < locInt && locInt < 429) {

                switch (locInt) {

                    case 1:
                        loc = Uri.parse("geo:0,0?q=16.6331,74.3620055555556(Location 1)");
                        break;
                    case 2:
                        loc = Uri.parse("geo:0,0?q=16.6441472222222,74.3557805555556(Location 2)");
                        break;
                    case 3:
                        loc = Uri.parse("geo:0,0?q=16.6312638888889,74.3674694444444(Location 3)");
                        break;
                    case 4:
                        loc = Uri.parse("geo:0,0?q=16.6295277777778,74.370325(Location 4)");
                        break;
                    case 5:
                        loc = Uri.parse("geo:0,0?q=16.6276666666667,74.3735472222222(Location 5)");
                        break;
                    case 6:
                        loc = Uri.parse("geo:0,0?q=16.6258694444444,74.3766666666667(Location 6)");
                        break;
                    case 7:
                        loc = Uri.parse("geo:0,0?q=16.6231111111111,74.3790555555556(Location 7)");
                        break;
                    case 8:
                        loc = Uri.parse("geo:0,0?q=16.6204333333333,74.3814(Location 8)");
                        break;
                    case 9:
                        loc = Uri.parse("geo:0,0?q=17.2180166666667,74.3834972222222(Location 9)");
                        break;
                    case 10:
                        loc = Uri.parse("geo:0,0?q=16.6152555555556,74.3858972222222(Location 10)");
                        break;
                    case 11:
                        loc = Uri.parse("geo:0,0?q=16.6125777777778,74.3882305555556(Location 11)");
                        break;
                    case 12:
                        loc = Uri.parse("geo:0,0?q=16.6092527777778,74.3886555555556(Location 12)");
                        break;
                    case 13:
                        loc = Uri.parse("geo:0,0?q=16.6060361111111,74.3891138888889(Location 13)");
                        break;
                    case 14:
                        loc = Uri.parse("geo:0,0?q=16.6025305555556,74.3895277777778(Location 14)");
                        break;
                    case 15:
                        loc = Uri.parse("geo:0,0?q=16.5995666666667,74.3899138888889(Location 15)");
                        break;
                    case 16:
                        loc = Uri.parse("geo:0,0?q=16.5963416666667,74.390325(Location 16)");
                        break;
                    case 17:
                        loc = Uri.parse("geo:0,0?q=16.5927527777778,74.0574638888889(Location 17)");
                        break;
                    case 18:
                        loc = Uri.parse("geo:0,0?q=16.5898472222222,74.3888555555556(Location 18)");
                        break;
                    case 19:
                        loc = Uri.parse("geo:0,0?q=16.5872194444444,74.3870916666667(Location 19)");
                        break;
                    case 20:
                        loc = Uri.parse("geo:0,0?q=16.5846472222222,74.3854055555556(Location 20)");
                        break;
                    case 21:
                        loc = Uri.parse("geo:0,0?q=16.5820472222222,74.38365(Location 21)");
                        break;
                    case 22:
                        loc = Uri.parse("geo:0,0?q=16.5791055555556,74.3816638888889(Location 22)");
                        break;
                    case 23:
                        loc = Uri.parse("geo:0,0?q=16.5764972222222,74.3799472222222(Location 23)");
                        break;
                    case 24:
                        loc = Uri.parse("geo:0,0?q=16.5739416666667,74.37825(Location 24)");
                        break;
                    case 25:
                        loc = Uri.parse("geo:0,0?q=16.5713527777778,74.3666666666667(Location 25)");
                        break;
                    case 26:
                        loc = Uri.parse("geo:0,0?q=16.5684361111111,74.3753972222222(Location 26)");
                        break;
                    case 27:
                        loc = Uri.parse("geo:0,0?q=16.5658666666667,74.3741027777778(Location 27)");
                        break;
                    case 28:
                        loc = Uri.parse("geo:0,0?q=16.563375,74.3727722222222(Location 28)");
                        break;
                    case 29:
                        loc = Uri.parse("geo:0,0?q=16.5602583333333,74.3726972222222(Location 29)");
                        break;
                    case 30:
                        loc = Uri.parse("geo:0,0?q=16.5566861111111,74.3726166666667(Location 30)");
                        break;
                    case 31:
                        loc = Uri.parse("geo:0,0?q=16.5531611111111,74.3725416666667(Location 31)");
                        break;
                    case 32:
                        loc = Uri.parse("geo:0,0?q=16.549825,74.3724694444444(Location 32)");
                        break;
                    case 33:
                        loc = Uri.parse("geo:0,0?q=16.5463472222222,74.3730611111111(Location 33)");
                        break;
                    case 34:
                        loc = Uri.parse("geo:0,0?q=16.5427777777778,74.3736722222222(Location 34)");
                        break;
                    case 35:
                        loc = Uri.parse("geo:0,0?q=16.5392083333333,74.3742833333333(Location 35)");
                        break;
                    case 36:
                        loc = Uri.parse("geo:0,0?q=16.5356861111111,74.3748944444444(Location 36)");
                        break;
                    case 37:
                        loc = Uri.parse("geo:0,0?q=16.5325138888889,74.3754027777778(Location 37)");
                        break;
                    case 38:
                        loc = Uri.parse("geo:0,0?q=16.5290888888889,74.3760222222222(Location 38)");
                        break;
                    case 39:
                        loc = Uri.parse("geo:0,0?q=16.5268166666667,74.3746888888889(Location 39)");
                        break;
                    case 40:
                        loc = Uri.parse("geo:0,0?q=16.5236944444444,74.3728444444444(Location 40)");
                        break;
                    case 41:
                        loc = Uri.parse("geo:0,0?q=16.5206861111111,74.3710722222222(Location 41)");
                        break;
                    case 42:
                        loc = Uri.parse("geo:0,0?q=16.5175444444444,74.3692277777778(Location 42)");
                        break;
                    case 43:
                        loc = Uri.parse("geo:0,0?q=16.514475,74.3674861111111(Location 43)");
                        break;
                    case 44:
                        loc = Uri.parse("geo:0,0?q=16.5113333333333,74.3655666666667(Location 44)");
                        break;
                    case 45:
                        loc = Uri.parse("geo:0,0?q=16.5083805555556,74.3638333333333(Location 45)");
                        break;
                    case 46:
                        loc = Uri.parse("geo:0,0?q=16.5079861111111,74.3624194444444(Location 46)");
                        break;
                    case 47:
                        loc = Uri.parse("geo:0,0?q=16.5077194444444,74.3606944444444(Location 47)");
                        break;
                    case 48:
                        loc = Uri.parse("geo:0,0?q=16.5051027777778,74.3593916666667(Location 48)");
                        break;
                    case 49:
                        loc = Uri.parse("geo:0,0?q=16.5028222222222,74.3582666666667(Location 49)");
                        break;
                    case 50:
                        loc = Uri.parse("geo:0,0?q=16.5001305555556,74.3586416666667(Location 50)");
                        break;
                    case 51:
                        loc = Uri.parse("geo:0,0?q=16.4975361111111,74.3590138888889(Location 51)");
                        break;
                    case 52:
                        loc = Uri.parse("geo:0,0?q=16.4941305555556,74.359475(Location 52)");
                        break;
                    case 53:
                        loc = Uri.parse("geo:0,0?q=16.4912555555556,74.3598694444444(Location 53)");
                        break;
                    case 54:
                        loc = Uri.parse("geo:0,0?q=16.4880944444444,74.3603111111111(Location 54)");
                        break;
                    case 55:
                        loc = Uri.parse("geo:0,0?q=16.4845333333333,74.3608(Location 55)");
                        break;
                    case 56:
                        loc = Uri.parse("geo:0,0?q=16.4809111111111,74.3612888888889(Location 56)");
                        break;
                    case 57:
                        loc = Uri.parse("geo:0,0?q=16.4773944444444,74.3617888888889(Location 57)");
                        break;
                    case 58:
                        loc = Uri.parse("geo:0,0?q=16.4738722222222,74.4734527777778(Location 58)");
                        break;
                    case 59:
                        loc = Uri.parse("geo:0,0?q=16.4704638888889,74.3628027777778(Location 59)");
                        break;
                    case 60:
                        loc = Uri.parse("geo:0,0?q=16.4669583333333,74.3632638888889(Location 60)");
                        break;
                    case 61:
                        loc = Uri.parse("geo:0,0?q=16.4634444444444,74.3633611111111(Location 61)");
                        break;
                    case 62:
                        loc = Uri.parse("geo:0,0?q=16.4598194444444,74.3634555555555(Location 62)");
                        break;
                    case 63:
                        loc = Uri.parse("geo:0,0?q=16.4565277777778,74.3635888888889(Location 63)");
                        break;
                    case 64:
                        loc = Uri.parse("geo:0,0?q=16.4529944444444,74.3637027777778(Location 64)");
                        break;
                    case 65:
                        loc = Uri.parse("geo:0,0?q=16.4493333333333,74.3637805555556(Location 65)");
                        break;
                    case 66:
                        loc = Uri.parse("geo:0,0?q=16.4460861111111,74.3626305555556(Location 66)");
                        break;
                    case 67:
                        loc = Uri.parse("geo:0,0?q=16.4427638888889,74.3614527777778(Location 67)");
                        break;
                    case 68:
                        loc = Uri.parse("geo:0,0?q=16.4418888888889,74.3594694444444(Location 68)");
                        break;
                    case 69:
                        loc = Uri.parse("geo:0,0?q=16.4400027777778,74.3568611111111(Location 69)");
                        break;
                    case 70:
                        loc = Uri.parse("geo:0,0?q=16.4381666666667,74.3541611111111(Location 70)");
                        break;
                    case 71:
                        loc = Uri.parse("geo:0,0?q=16.4360416666667,74.3511333333333(Location 71)");
                        break;
                    case 72:
                        loc = Uri.parse("geo:0,0?q=16.4344805555556,74.3488805555556(Location 72)");
                        break;
                    case 73:
                        loc = Uri.parse("geo:0,0?q=16.4324833333333,74.3459361111111(Location 73)");
                        break;
                    case 74:
                        loc = Uri.parse("geo:0,0?q=16.4295388888889,74.3440722222222(Location 74)");
                        break;
                    case 75:
                        loc = Uri.parse("geo:0,0?q=16.42645,74.3421833333333(Location 75)");
                        break;
                    case 76:
                        loc = Uri.parse("geo:0,0?q=16.4236972222222,74.3404444444444(Location 76)");
                        break;
                    case 77:
                        loc = Uri.parse("geo:0,0?q=16.4205638888889,74.3385861111111(Location 77)");
                        break;
                    case 78:
                        loc = Uri.parse("geo:0,0?q=16.4175388888889,74.3365277777778(Location 78)");
                        break;
                    case 79:
                        loc = Uri.parse("geo:0,0?q=16.4145138888889,74.3346833333333(Location 79)");
                        break;
                    case 80:
                        loc = Uri.parse("geo:0,0?q=16.4114166666667,74.3327361111111(Location 80)");
                        break;
                    case 81:
                        loc = Uri.parse("geo:0,0?q=16.4086805555556,74.3310888888889(Location 81)");
                        break;
                    case 82:
                        loc = Uri.parse("geo:0,0?q=16.4056027777778,74.3293666666667(Location 82)");
                        break;
                    case 83:
                        loc = Uri.parse("geo:0,0?q=16.40285,74.3278972222222(Location 83)");
                        break;
                    case 84:
                        loc = Uri.parse("geo:0,0?q=16.3997805555556,74.3262305555556(Location 84)");
                        break;
                    case 85:
                        loc = Uri.parse("geo:0,0?q=16.3967916666667,74.3246194444444(Location 85)");
                        break;
                    case 86:
                        loc = Uri.parse("geo:0,0?q=16.3939666666667,74.3230666666667(Location 86)");
                        break;
                    case 87:
                        loc = Uri.parse("geo:0,0?q=16.3910416666667,74.3215027777778(Location 87)");
                        break;
                    case 88:
                        loc = Uri.parse("geo:0,0?q=16.3880166666667,74.3198944444444(Location 88)");
                        break;
                    case 89:
                        loc = Uri.parse("geo:0,0?q=16.3853,74.3184055555556(Location 89)");
                        break;
                    case 90:
                        loc = Uri.parse("geo:0,0?q=16.3823555555556,74.3167944444444(Location 90)");
                        break;
                    case 91:
                        loc = Uri.parse("geo:0,0?q=16.3796333333333,74.3157194444444(Location 91)");
                        break;
                    case 92:
                        loc = Uri.parse("geo:0,0?q=16.3764361111111,74.3143805555556(Location 92)");
                        break;
                    case 93:
                        loc = Uri.parse("geo:0,0?q=16.3729888888889,74.3129888888889(Location 93)");
                        break;
                    case 94:
                        loc = Uri.parse("geo:0,0?q=16.3698027777778,74.3117361111111(Location 94)");
                        break;
                    case 95:
                        loc = Uri.parse("geo:0,0?q=16.3665972222222,74.3101083333333(Location 95)");
                        break;
                    case 96:
                        loc = Uri.parse("geo:0,0?q=16.3638,74.3086472222222(Location 96)");
                        break;
                    case 97:
                        loc = Uri.parse("geo:0,0?q=16.3609194444444,74.3072722222222(Location 97)");
                        break;
                    case 98:
                        loc = Uri.parse("geo:0,0?q=16.3580027777778,74.3057194444444(Location 98)");
                        break;
                    case 99:
                        loc = Uri.parse("geo:0,0?q=16.3549333333333,74.3041305555556(Location 99)");
                        break;
                    case 100:
                        loc = Uri.parse("geo:0,0?q=16.3518916666667,74.3025194444444(Location 100)");
                        break;
                    case 101:
                        loc = Uri.parse("geo:0,0?q=16.3487861111111,74.30095(Location 101)");
                        break;
                    case 102:
                        loc = Uri.parse("geo:0,0?q=16.3456611111111,74.299275(Location 102)");
                        break;
                    case 103:
                        loc = Uri.parse("geo:0,0?q=16.3427083333333,74.2977027777778(Location 103)");
                        break;
                    case 104:
                        loc = Uri.parse("geo:0,0?q=16.3395583333333,74.2958694444444(Location 104)");
                        break;
                    case 105:
                        loc = Uri.parse("geo:0,0?q=16.3363972222222,74.2940666666667(Location 105)");
                        break;
                    case 106:
                        loc = Uri.parse("geo:0,0?q=16.3332805555556,74.2922888888889(Location 106)");
                        break;
                    case 107:
                        loc = Uri.parse("geo:0,0?q=16.3302277777778,74.2904361111111(Location 107)");
                        break;
                    case 108:
                        loc = Uri.parse("geo:0,0?q=16.3276555555556,74.2891111111111(Location 108)");
                        break;
                    case 109:
                        loc = Uri.parse("geo:0,0?q=16.3241083333333,74.2876888888889(Location 109)");
                        break;
                    case 110:
                        loc = Uri.parse("geo:0,0?q=16.3213583333333,74.2866666666667(Location 110)");
                        break;
                    case 111:
                        loc = Uri.parse("geo:0,0?q=16.318425,74.2856222222222(Location 111)");
                        break;
                    case 112:
                        loc = Uri.parse("geo:0,0?q=16.3156111111111,74.2846111111111(Location 112)");
                        break;
                    case 113:
                        loc = Uri.parse("geo:0,0?q=16.3127694444444,74.2836277777778(Location 113)");
                        break;
                    case 114:
                        loc = Uri.parse("geo:0,0?q=16.3095111111111,74.2826027777778(Location 114)");
                        break;
                    case 115:
                        loc = Uri.parse("geo:0,0?q=16.3057916666667,74.2816972222222(Location 115)");
                        break;
                    case 116:
                        loc = Uri.parse("geo:0,0?q=16.3023527777778,74.2806444444444(Location 116)");
                        break;
                    case 117:
                        loc = Uri.parse("geo:0,0?q=16.2994111111111,74.2788583333333(Location 117)");
                        break;
                    case 118:
                        loc = Uri.parse("geo:0,0?q=16.2992222222222,74.2772(Location 118)");
                        break;
                    case 119:
                        loc = Uri.parse("geo:0,0?q=16.2990638888889,74.2753666666667(Location 119)");
                        break;
                    case 120:
                        loc = Uri.parse("geo:0,0?q=16.2965277777778,74.2737388888889(Location 120)");
                        break;
                    case 121:
                        loc = Uri.parse("geo:0,0?q=16.2931444444444,74.2730861111111(Location 121)");
                        break;
                    case 122:
                        loc = Uri.parse("geo:0,0?q=16.2899416666667,74.2724416666667(Location 122)");
                        break;
                    case 123:
                        loc = Uri.parse("geo:0,0?q=16.2863583333333,74.2717555555556(Location 123)");
                        break;
                    case 124:
                        loc = Uri.parse("geo:0,0?q=16.2829222222222,74.2710916666667(Location 124)");
                        break;
                    case 125:
                        loc = Uri.parse("geo:0,0?q=16.2786083333333,74.270275(Location 125)");
                        break;
                    case 126:
                        loc = Uri.parse("geo:0,0?q=16.2752611111111,74.2695861111111(Location 126)");
                        break;
                    case 127:
                        loc = Uri.parse("geo:0,0?q=16.2726,74.2691083333333(Location 127)");
                        break;
                    case 128:
                        loc = Uri.parse("geo:0,0?q=16.2698555555556,74.2674083333333(Location 128)");
                        break;
                    case 129:
                        loc = Uri.parse("geo:0,0?q=16.266875,74.2655833333333(Location 129)");
                        break;
                    case 130:
                        loc = Uri.parse("geo:0,0?q=16.2639944444444,74.2638166666667(Location 130)");
                        break;
                    case 131:
                        loc = Uri.parse("geo:0,0?q=16.2613055555556,74.2621527777778(Location 131)");
                        break;
                    case 132:
                        loc = Uri.parse("geo:0,0?q=16.2587944444444,74.260625(Location 132)");
                        break;
                    case 133:
                        loc = Uri.parse("geo:0,0?q=16.2549361111111,74.2582083333333(Location 133)");
                        break;
                    case 134:
                        loc = Uri.parse("geo:0,0?q=16.2520361111111,74.2563833333333(Location 134)");
                        break;
                    case 135:
                        loc = Uri.parse("geo:0,0?q=16.2489388888889,74.2545138888889(Location 135)");
                        break;
                    case 136:
                        loc = Uri.parse("geo:0,0?q=16.2462305555556,74.2528222222222(Location 136)");
                        break;
                    case 137:
                        loc = Uri.parse("geo:0,0?q=16.242775,74.2523777777778(Location 137)");
                        break;
                    case 138:
                        loc = Uri.parse("geo:0,0?q=16.2392472222222,74.2724888888889(Location 138)");
                        break;
                    case 139:
                        loc = Uri.parse("geo:0,0?q=16.2355666666667,74.2514027777778(Location 139)");
                        break;
                    case 140:
                        loc = Uri.parse("geo:0,0?q=16.232675,74.2510861111111(Location 140)");
                        break;
                    case 141:
                        loc = Uri.parse("geo:0,0?q=16.2291972222222,74.2523055555556(Location 141)");
                        break;
                    case 142:
                        loc = Uri.parse("geo:0,0?q=16.2257666666667,74.2535638888889(Location 142)");
                        break;
                    case 143:
                        loc = Uri.parse("geo:0,0?q=16.2224277777778,74.2547(Location 143)");
                        break;
                    case 144:
                        loc = Uri.parse("geo:0,0?q=16.21905,74.2559555555556(Location 144)");
                        break;
                    case 145:
                        loc = Uri.parse("geo:0,0?q=16.2156916666667,74.2571194444444(Location 145)");
                        break;
                    case 146:
                        loc = Uri.parse("geo:0,0?q=16.2127305555556,74.2581972222222(Location 146)");
                        break;
                    case 147:
                        loc = Uri.parse("geo:0,0?q=16.2101111111111,74.2565222222222(Location 147)");
                        break;
                    case 148:
                        loc = Uri.parse("geo:0,0?q=16.2072305555556,74.254775(Location 148)");
                        break;
                    case 149:
                        loc = Uri.parse("geo:0,0?q=16.20435,74.2529527777778(Location 149)");
                        break;
                    case 150:
                        loc = Uri.parse("geo:0,0?q=16.2008861111111,74.2508444444444(Location 150)");
                        break;
                    case 151:
                        loc = Uri.parse("geo:0,0?q=16.1983083333333,74.2492277777778(Location 151)");
                        break;
                    case 152:
                        loc = Uri.parse("geo:0,0?q=16.1953305555556,74.2475222222222(Location 152)");
                        break;
                    case 153:
                        loc = Uri.parse("geo:0,0?q=16.1926694444444,74.2457333333333(Location 153)");
                        break;
                    case 154:
                        loc = Uri.parse("geo:0,0?q=16.1897111111111,75.2869444444444(Location 154)");
                        break;
                    case 155:
                        loc = Uri.parse("geo:0,0?q=16.1877222222222,74.2426194444444(Location 155)");
                        break;
                    case 156:
                        loc = Uri.parse("geo:0,0?q=16.1846527777778,74.2407055555556(Location 156)");
                        break;
                    case 157:
                        loc = Uri.parse("geo:0,0?q=16.1817555555556,74.2388694444444(Location 157)");
                        break;
                    case 158:
                        loc = Uri.parse("geo:0,0?q=16.1781305555556,74.2383194444444(Location 158)");
                        break;
                    case 159:
                        loc = Uri.parse("geo:0,0?q=16.1751055555556,74.2377388888889(Location 159)");
                        break;
                    case 160:
                        loc = Uri.parse("geo:0,0?q=16.1719444444444,74.2372416666667(Location 160)");
                        break;
                    case 161:
                        loc = Uri.parse("geo:0,0?q=16.1686055555556,74.2366861111111(Location 161)");
                        break;
                    case 162:
                        loc = Uri.parse("geo:0,0?q=16.1656,74.236125(Location 162)");
                        break;
                    case 163:
                        loc = Uri.parse("geo:0,0?q=16.1631388888889,74.23425(Location 163)");
                        break;
                    case 164:
                        loc = Uri.parse("geo:0,0?q=16.1606388888889,74.2297222222222(Location 164)");
                        break;
                    case 165:
                        loc = Uri.parse("geo:0,0?q=16.1585,74.2308611111111(Location 165)");
                        break;
                    case 166:
                        loc = Uri.parse("geo:0,0?q=16.1568611111111,74.2296666666667(Location 166)");
                        break;
                    case 167:
                        loc = Uri.parse("geo:0,0?q=17.6539166666667,74.2278333333333(Location 167)");
                        break;
                    case 168:
                        loc = Uri.parse("geo:0,0?q=16.1510277777778,74.2260555555556(Location 168)");
                        break;
                    case 169:
                        loc = Uri.parse("geo:0,0?q=16.1483055555556,74.2243888888889(Location 169)");
                        break;
                    case 170:
                        loc = Uri.parse("geo:0,0?q=16.1466111111111,74.2230277777778(Location 170)");
                        break;
                    case 171:
                        loc = Uri.parse("geo:0,0?q=16.1437777777778,74.2234444444445(Location 171)");
                        break;
                    case 172:
                        loc = Uri.parse("geo:0,0?q=16.14075,74.2238333333333(Location 172)");
                        break;
                    case 173:
                        loc = Uri.parse("geo:0,0?q=16.13725,74.2243055555556(Location 173)");
                        break;
                    case 174:
                        loc = Uri.parse("geo:0,0?q=16.1361944444444,74.2246111111111(Location 174)");
                        break;
                    case 175:
                        loc = Uri.parse("geo:0,0?q=16.1198055555556,74.2241944444444(Location 175)");
                        break;
                    case 176:
                        loc = Uri.parse("geo:0,0?q=16.1276111111111,74.2256111111111(Location 176)");
                        break;
                    case 177:
                        loc = Uri.parse("geo:0,0?q=16.1253888888889,74.2266944444444(Location 177)");
                        break;
                    case 178:
                        loc = Uri.parse("geo:0,0?q=16.1228055555556,74.2278611111111(Location 178)");
                        break;
                    case 179:
                        loc = Uri.parse("geo:0,0?q=16.1201111111111,74.2291111111111(Location 179)");
                        break;
                    case 180:
                        loc = Uri.parse("geo:0,0?q=16.1167222222222,74.2299166666667(Location 180)");
                        break;
                    case 181:
                        loc = Uri.parse("geo:0,0?q=16.1125833333333,74.2308333333333(Location 181)");
                        break;
                    case 182:
                        loc = Uri.parse("geo:0,0?q=16.1097222222222,74.2316388888889(Location 182)");
                        break;
                    case 183:
                        loc = Uri.parse("geo:0,0?q=16.1063055555556,74.2325(Location 183)");
                        break;
                    case 184:
                        loc = Uri.parse("geo:0,0?q=16.1031111111111,74.2332777777778(Location 184)");
                        break;
                    case 185:
                        loc = Uri.parse("geo:0,0?q=16.0998055555556,74.2340833333333(Location 185)");
                        break;
                    case 186:
                        loc = Uri.parse("geo:0,0?q=16.0967777777778,74.2348333333333(Location 186)");
                        break;
                    case 187:
                        loc = Uri.parse("geo:0,0?q=16.0933888888889,74.2356666666667(Location 187)");
                        break;
                    case 188:
                        loc = Uri.parse("geo:0,0?q=16.0900833333333,74.2349444444445(Location 188)");
                        break;
                    case 189:
                        loc = Uri.parse("geo:0,0?q=16.0876388888889,74.2343611111111(Location 189)");
                        break;
                    case 190:
                        loc = Uri.parse("geo:0,0?q=16.0845277777778,74.2336944444444(Location 190)");
                        break;
                    case 191:
                        loc = Uri.parse("geo:0,0?q=16.0818333333333,74.233(Location 191)");
                        break;
                    case 192:
                        loc = Uri.parse("geo:0,0?q=16.0786388888889,74.23225(Location 192)");
                        break;
                    case 193:
                        loc = Uri.parse("geo:0,0?q=16.0764166666667,74.2317777777778(Location 193)");
                        break;
                    case 194:
                        loc = Uri.parse("geo:0,0?q=16.0743333333333,74.2290555555556(Location 194)");
                        break;
                    case 195:
                        loc = Uri.parse("geo:0,0?q=16.0725833333333,74.2267777777778(Location 195)");
                        break;
                    case 196:
                        loc = Uri.parse("geo:0,0?q=16.0707777777778,74.2240277777778(Location 196)");
                        break;
                    case 197:
                        loc = Uri.parse("geo:0,0?q=16.0688611111111,74.2210277777778(Location 197)");
                        break;
                    case 198:
                        loc = Uri.parse("geo:0,0?q=16.0675555555556,74.219(Location 198)");
                        break;
                    case 199:
                        loc = Uri.parse("geo:0,0?q=16.0645277777778,74.2173888888889(Location 199)");
                        break;
                    case 200:
                        loc = Uri.parse("geo:0,0?q=16.0617222222222,74.2270833333333(Location 200)");
                        break;
                    case 201:
                        loc = Uri.parse("geo:0,0?q=16.0591944444444,74.2146666666667(Location 201)");
                        break;
                    case 202:
                        loc = Uri.parse("geo:0,0?q=16.05575,74.2160833333333(Location 202)");
                        break;
                    case 203:
                        loc = Uri.parse("geo:0,0?q=16.0526388888889,74.2139166666667(Location 203)");
                        break;
                    case 204:
                        loc = Uri.parse("geo:0,0?q=16.0514722222222,74.2119444444444(Location 204)");
                        break;
                    case 205:
                        loc = Uri.parse("geo:0,0?q=16.0503333333333,74.2101111111111(Location 205)");
                        break;
                    case 206:
                        loc = Uri.parse("geo:0,0?q=16.0471944444444,74.20925(Location 206)");
                        break;
                    case 207:
                        loc = Uri.parse("geo:0,0?q=16.0447222222222,74.20775(Location 207)");
                        break;
                    case 208:
                        loc = Uri.parse("geo:0,0?q=16.0423333333333,74.2078333333333(Location 208)");
                        break;
                    case 209:
                        loc = Uri.parse("geo:0,0?q=16.0388333333333,74.2069166666667(Location 209)");
                        break;
                    case 210:
                        loc = Uri.parse("geo:0,0?q=16.0352222222222,74.2059166666667(Location 210)");
                        break;
                    case 211:
                        loc = Uri.parse("geo:0,0?q=16.0318888888889,74.2050555555556(Location 211)");
                        break;
                    case 212:
                        loc = Uri.parse("geo:0,0?q=16.0295,74.2044166666667(Location 212)");
                        break;
                    case 213:
                        loc = Uri.parse("geo:0,0?q=16.0263611111111,74.2036111111111(Location 213)");
                        break;
                    case 214:
                        loc = Uri.parse("geo:0,0?q=16.0231111111111,74.2027222222222(Location 214)");
                        break;
                    case 215:
                        loc = Uri.parse("geo:0,0?q=16.0204722222222,74.2010555555556(Location 215)");
                        break;
                    case 216:
                        loc = Uri.parse("geo:0,0?q=16.0176944444444,74.1992222222222(Location 216)");
                        break;
                    case 217:
                        loc = Uri.parse("geo:0,0?q=16.01525,74.1976666666667(Location 217)");
                        break;
                    case 218:
                        loc = Uri.parse("geo:0,0?q=16.0121944444444,74.1956666666667(Location 218)");
                        break;
                    case 219:
                        loc = Uri.parse("geo:0,0?q=16.0091944444444,74.19375(Location 219)");
                        break;
                    case 220:
                        loc = Uri.parse("geo:0,0?q=16.0067222222222,74.1922222222222(Location 220)");
                        break;
                    case 221:
                        loc = Uri.parse("geo:0,0?q=16.0037222222222,74.19025(Location 221)");
                        break;
                    case 222:
                        loc = Uri.parse("geo:0,0?q=16.0007777777778,74.1883611111111(Location 222)");
                        break;
                    case 223:
                        loc = Uri.parse("geo:0,0?q=15.9985,74.1868888888889(Location 223)");
                        break;
                    case 224:
                        loc = Uri.parse("geo:0,0?q=15.9963333333333,74.1841388888889(Location 224)");
                        break;
                    case 225:
                        loc = Uri.parse("geo:0,0?q=15.9941666666667,74.1814166666667(Location 225)");
                        break;
                    case 226:
                        loc = Uri.parse("geo:0,0?q=15.9920277777778,74.1786944444444(Location 226)");
                        break;
                    case 227:
                        loc = Uri.parse("geo:0,0?q=15.9897777777778,74.1758333333333(Location 227)");
                        break;
                    case 228:
                        loc = Uri.parse("geo:0,0?q=15.9875,74.1729444444445(Location 228)");
                        break;
                    case 229:
                        loc = Uri.parse("geo:0,0?q=15.9854444444444,74.1703055555556(Location 229)");
                        break;
                    case 230:
                        loc = Uri.parse("geo:0,0?q=15.9830833333333,74.1672777777778(Location 230)");
                        break;
                    case 231:
                        loc = Uri.parse("geo:0,0?q=15.9825555555556,74.1634444444445(Location 231)");
                        break;
                    case 232:
                        loc = Uri.parse("geo:0,0?q=15.9821666666667,74.1605277777778(Location 232)");
                        break;
                    case 233:
                        loc = Uri.parse("geo:0,0?q=15.9815,74.15575(Location 233)");
                        break;
                    case 234:
                        loc = Uri.parse("geo:0,0?q=15.9811388888889,74.1532222222222(Location 234)");
                        break;
                    case 235:
                        loc = Uri.parse("geo:0,0?q=15.9806388888889,74.1496111111111(Location 235)");
                        break;
                    case 236:
                        loc = Uri.parse("geo:0,0?q=15.9803055555556,74.1471111111111(Location 236)");
                        break;
                    case 237:
                        loc = Uri.parse("geo:0,0?q=15.9796944444444,74.1426666666667(Location 237)");
                        break;
                    case 238:
                        loc = Uri.parse("geo:0,0?q=15.9777222222222,74.1403611111111(Location 238)");
                        break;
                    case 239:
                        loc = Uri.parse("geo:0,0?q=15.9758611111111,74.13825(Location 239)");
                        break;
                    case 240:
                        loc = Uri.parse("geo:0,0?q=15.9735277777778,74.1355555555556(Location 240)");
                        break;
                    case 241:
                        loc = Uri.parse("geo:0,0?q=15.97175,74.1335555555556(Location 241)");
                        break;
                    case 242:
                        loc = Uri.parse("geo:0,0?q=15.97025,74.1311666666667(Location 242)");
                        break;
                    case 243:
                        loc = Uri.parse("geo:0,0?q=15.9681111111111,74.1278055555556(Location 243)");
                        break;
                    case 244:
                        loc = Uri.parse("geo:0,0?q=15.9660833333333,74.1246944444444(Location 244)");
                        break;
                    case 245:
                        loc = Uri.parse("geo:0,0?q=15.96525,74.1233611111111(Location 245)");
                        break;
                    case 246:
                        loc = Uri.parse("geo:0,0?q=15.9632777777778,74.1203888888889(Location 246)");
                        break;
                    case 247:
                        loc = Uri.parse("geo:0,0?q=15.9623888888889,74.1188611111111(Location 247)");
                        break;
                    case 248:
                        loc = Uri.parse("geo:0,0?q=15.9606111111111,74.1161111111111(Location 248)");
                        break;
                    case 249:
                        loc = Uri.parse("geo:0,0?q=15.9597222222222,74.1130277777778(Location 249)");
                        break;
                    case 250:
                        loc = Uri.parse("geo:0,0?q=15.9586666666667,74.1096111111111(Location 250)");
                        break;
                    case 251:
                        loc = Uri.parse("geo:0,0?q=15.9579722222222,74.1072777777778(Location 251)");
                        break;
                    case 252:
                        loc = Uri.parse("geo:0,0?q=15.9568611111111,74.1035555555555(Location 252)");
                        break;
                    case 253:
                        loc = Uri.parse("geo:0,0?q=15.9561944444444,74.1013611111111(Location 253)");
                        break;
                    case 254:
                        loc = Uri.parse("geo:0,0?q=15.9554722222222,74.099(Location 254)");
                        break;
                    case 255:
                        loc = Uri.parse("geo:0,0?q=15.95475,74.0961666666667(Location 255)");
                        break;
                    case 256:
                        loc = Uri.parse("geo:0,0?q=15.9551666666667,74.0938333333333(Location 256)");
                        break;
                    case 257:
                        loc = Uri.parse("geo:0,0?q=15.9557777777778,74.0903055555555(Location 257)");
                        break;
                    case 258:
                        loc = Uri.parse("geo:0,0?q=15.9561666666667,74.0878888888889(Location 258)");
                        break;
                    case 259:
                        loc = Uri.parse("geo:0,0?q=15.9566111111111,74.0854166666667(Location 259)");
                        break;
                    case 260:
                        loc = Uri.parse("geo:0,0?q=15.9578055555556,74.0833055555556(Location 260)");
                        break;
                    case 261:
                        loc = Uri.parse("geo:0,0?q=15.9590555555556,74.0810555555556(Location 261)");
                        break;
                    case 262:
                        loc = Uri.parse("geo:0,0?q=15.9587222222222,74.0783611111111(Location 262)");
                        break;
                    case 263:
                        loc = Uri.parse("geo:0,0?q=15.9584166666667,74.0756111111111(Location 263)");
                        break;
                    case 264:
                        loc = Uri.parse("geo:0,0?q=15.9577222222222,74.0720555555556(Location 264)");
                        break;
                    case 265:
                        loc = Uri.parse("geo:0,0?q=15.9571388888889,74.0688888888889(Location 265)");
                        break;
                    case 266:
                        loc = Uri.parse("geo:0,0?q=15.95675,74.06675(Location 266)");
                        break;
                    case 267:
                        loc = Uri.parse("geo:0,0?q=15.9563055555556,74.0648611111111(Location 267)");
                        break;
                    case 268:
                        loc = Uri.parse("geo:0,0?q=15.9550555555556,74.0630277777778(Location 268)");
                        break;
                    case 269:
                        loc = Uri.parse("geo:0,0?q=15.9536388888889,74.0606666666667(Location 269)");
                        break;
                    case 270:
                        loc = Uri.parse("geo:0,0?q=15.9524444444444,74.0587222222222(Location 270)");
                        break;
                    case 271:
                        loc = Uri.parse("geo:0,0?q=15.95075,74.0560277777778(Location 271)");
                        break;
                    case 272:
                        loc = Uri.parse("geo:0,0?q=15.9481388888889,74.0541666666667(Location 272)");
                        break;
                    case 273:
                        loc = Uri.parse("geo:0,0?q=15.9451388888889,74.0519722222222(Location 273)");
                        break;
                    case 274:
                        loc = Uri.parse("geo:0,0?q=15.9419722222222,74.0515833333333(Location 274)");
                        break;
                    case 275:
                        loc = Uri.parse("geo:0,0?q=15.9389166666667,74.0511666666667(Location 275)");
                        break;
                    case 276:
                        loc = Uri.parse("geo:0,0?q=15.9358055555556,74.05075(Location 276)");
                        break;
                    case 277:
                        loc = Uri.parse("geo:0,0?q=15.9326111111111,74.0503333333333(Location 277)");
                        break;
                    case 278:
                        loc = Uri.parse("geo:0,0?q=15.9285555555556,74.0498055555556(Location 278)");
                        break;
                    case 279:
                        loc = Uri.parse("geo:0,0?q=15.9257777777778,74.0494166666667(Location 279)");
                        break;
                    case 280:
                        loc = Uri.parse("geo:0,0?q=15.9228611111111,74.0490277777778(Location 280)");
                        break;
                    case 281:
                        loc = Uri.parse("geo:0,0?q=15.9202222222222,74.0486666666667(Location 281)");
                        break;
                    case 282:
                        loc = Uri.parse("geo:0,0?q=15.91775,74.0483055555556(Location 282)");
                        break;
                    case 283:
                        loc = Uri.parse("geo:0,0?q=15.915,74.0473611111111(Location 283)");
                        break;
                    case 284:
                        loc = Uri.parse("geo:0,0?q=15.9123055555556,74.0464722222222(Location 284)");
                        break;
                    case 285:
                        loc = Uri.parse("geo:0,0?q=15.9091111111111,74.0453611111111(Location 285)");
                        break;
                    case 286:
                        loc = Uri.parse("geo:0,0?q=15.9076666666667,74.0445555555555(Location 286)");
                        break;
                    case 287:
                        loc = Uri.parse("geo:0,0?q=15.9043611111111,74.0438055555556(Location 287)");
                        break;
                    case 288:
                        loc = Uri.parse("geo:0,0?q=15.9010833333333,74.0427222222222(Location 288)");
                        break;
                    case 289:
                        loc = Uri.parse("geo:0,0?q=15.8991388888889,74.0420555555555(Location 289)");
                        break;
                    case 290:
                        loc = Uri.parse("geo:0,0?q=15.8970833333333,74.0414166666667(Location 290)");
                        break;
                    case 291:
                        loc = Uri.parse("geo:0,0?q=15.8948611111111,74.0406666666667(Location 291)");
                        break;
                    case 292:
                        loc = Uri.parse("geo:0,0?q=15.89175,74.0407222222222(Location 292)");
                        break;
                    case 293:
                        loc = Uri.parse("geo:0,0?q=15.8890555555556,74.0407222222222(Location 293)");
                        break;
                    case 294:
                        loc = Uri.parse("geo:0,0?q=15.8851944444444,74.0407222222222(Location 294)");
                        break;
                    case 295:
                        loc = Uri.parse("geo:0,0?q=15.8814444444444,74.0407777777778(Location 295)");
                        break;
                    case 296:
                        loc = Uri.parse("geo:0,0?q=15.8788888888889,74.0408333333333(Location 296)");
                        break;
                    case 297:
                        loc = Uri.parse("geo:0,0?q=15.8751111111111,74.0408888888889(Location 297)");
                        break;
                    case 298:
                        loc = Uri.parse("geo:0,0?q=15.8731666666667,74.0406944444444(Location 298)");
                        break;
                    case 299:
                        loc = Uri.parse("geo:0,0?q=15.8691666666667,74.0403611111111(Location 299)");
                        break;
                    case 300:
                        loc = Uri.parse("geo:0,0?q=15.86475,74.0400277777778(Location 300)");
                        break;
                    case 301:
                        loc = Uri.parse("geo:0,0?q=15.8627222222222,74.0384444444444(Location 301)");
                        break;
                    case 302:
                        loc = Uri.parse("geo:0,0?q=15.8593055555556,74.0370555555556(Location 302)");
                        break;
                    case 303:
                        loc = Uri.parse("geo:0,0?q=15.8563888888889,74.0356944444444(Location 303)");
                        break;
                    case 304:
                        loc = Uri.parse("geo:0,0?q=15.8540277777778,74.0340555555556(Location 304)");
                        break;
                    case 305:
                        loc = Uri.parse("geo:0,0?q=15.8526944444444,74.0312777777778(Location 305)");
                        break;
                    case 306:
                        loc = Uri.parse("geo:0,0?q=15.8520277777778,74.0297777777778(Location 306)");
                        break;
                    case 307:
                        loc = Uri.parse("geo:0,0?q=15.8498888888889,74.0271944444444(Location 307)");
                        break;
                    case 308:
                        loc = Uri.parse("geo:0,0?q=15.8485555555556,74.0271111111111(Location 308)");
                        break;
                    case 309:
                        loc = Uri.parse("geo:0,0?q=15.8416388888889,74.0266111111111(Location 309)");
                        break;
                    case 310:
                        loc = Uri.parse("geo:0,0?q=15.8396666666667,74.0263055555556(Location 310)");
                        break;
                    case 311:
                        loc = Uri.parse("geo:0,0?q=15.8365277777778,74.0249444444444(Location 311)");
                        break;
                    case 312:
                        loc = Uri.parse("geo:0,0?q=15.8327222222222,74.0233333333333(Location 312)");
                        break;
                    case 313:
                        loc = Uri.parse("geo:0,0?q=15.8316111111111,74.0228333333333(Location 313)");
                        break;
                    case 314:
                        loc = Uri.parse("geo:0,0?q=15.8287222222222,74.0216388888889(Location 314)");
                        break;
                    case 315:
                        loc = Uri.parse("geo:0,0?q=15.8250277777778,74.02(Location 315)");
                        break;
                    case 316:
                        loc = Uri.parse("geo:0,0?q=15.8231666666667,74.0203611111111(Location 316)");
                        break;
                    case 317:
                        loc = Uri.parse("geo:0,0?q=15.8198611111111,74.0203888888889(Location 317)");
                        break;
                    case 318:
                        loc = Uri.parse("geo:0,0?q=15.8168055555556,74.0204166666667(Location 318)");
                        break;
                    case 319:
                        loc = Uri.parse("geo:0,0?q=15.8148333333333,74.0204166666667(Location 319)");
                        break;
                    case 320:
                        loc = Uri.parse("geo:0,0?q=15.8110277777778,74.0207222222222(Location 320)");
                        break;
                    case 321:
                        loc = Uri.parse("geo:0,0?q=15.8088055555556,74.0225(Location 321)");
                        break;
                    case 322:
                        loc = Uri.parse("geo:0,0?q=15.8068333333333,74.0243055555556(Location 322)");
                        break;
                    case 323:
                        loc = Uri.parse("geo:0,0?q=15.8033611111111,74.0248055555556(Location 323)");
                        break;
                    case 324:
                        loc = Uri.parse("geo:0,0?q=15.80025,74.0249722222222(Location 324)");
                        break;
                    case 325:
                        loc = Uri.parse("geo:0,0?q=15.7956944444444,74.0251111111111(Location 325)");
                        break;
                    case 326:
                        loc = Uri.parse("geo:0,0?q=15.794,74.0246111111111(Location 326)");
                        break;
                    case 327:
                        loc = Uri.parse("geo:0,0?q=15.7916388888889,74.0256111111111(Location 327)");
                        break;
                    case 328:
                        loc = Uri.parse("geo:0,0?q=15.7885833333333,74.0272222222222(Location 328)");
                        break;
                    case 329:
                        loc = Uri.parse("geo:0,0?q=15.7865277777778,74.0279444444444(Location 329)");
                        break;
                    case 330:
                        loc = Uri.parse("geo:0,0?q=15.7846666666667,74.0293611111111(Location 330)");
                        break;
                    case 331:
                        loc = Uri.parse("geo:0,0?q=15.7827777777778,74.0308055555556(Location 331)");
                        break;
                    case 332:
                        loc = Uri.parse("geo:0,0?q=15.7812222222222,74.0314444444444(Location 332)");
                        break;
                    case 333:
                        loc = Uri.parse("geo:0,0?q=15.7793055555556,74.0319166666667(Location 333)");
                        break;
                    case 334:
                        loc = Uri.parse("geo:0,0?q=15.7786666666667,74.0338055555556(Location 334)");
                        break;
                    case 335:
                        loc = Uri.parse("geo:0,0?q=15.7777777777778,74.0343333333333(Location 335)");
                        break;
                    case 336:
                        loc = Uri.parse("geo:0,0?q=15.7750555555556,74.0360833333333(Location 336)");
                        break;
                    case 337:
                        loc = Uri.parse("geo:0,0?q=15.7727222222222,74.0395277777778(Location 337)");
                        break;
                    case 338:
                        loc = Uri.parse("geo:0,0?q=15.77075,74.0399166666667(Location 338)");
                        break;
                    case 339:
                        loc = Uri.parse("geo:0,0?q=15.7667777777778,74.0404444444444(Location 339)");
                        break;
                    case 340:
                        loc = Uri.parse("geo:0,0?q=15.7643333333333,74.0410555555556(Location 340)");
                        break;
                    case 341:
                        loc = Uri.parse("geo:0,0?q=15.7625,74.0415277777778(Location 341)");
                        break;
                    case 342:
                        loc = Uri.parse("geo:0,0?q=15.7588888888889,74.0410555555556(Location 342)");
                        break;
                    case 343:
                        loc = Uri.parse("geo:0,0?q=15.7567916666667,74.0408472222222(Location 343)");
                        break;
                    case 344:
                        loc = Uri.parse("geo:0,0?q=15.7545,74.0400555555556(Location 344)");
                        break;
                    case 345:
                        loc = Uri.parse("geo:0,0?q=15.7505555555556,74.0361666666667(Location 345)");
                        break;
                    case 346:
                        loc = Uri.parse("geo:0,0?q=15.749,74.0318055555556(Location 346)");
                        break;
                    case 347:
                        loc = Uri.parse("geo:0,0?q=15.7481861111111,74.0295527777778(Location 347)");
                        break;
                    case 348:
                        loc = Uri.parse("geo:0,0?q=15.7449444444444,74.0279166666667(Location 348)");
                        break;
                    case 349:
                        loc = Uri.parse("geo:0,0?q=15.7423611111111,74.0273888888889(Location 349)");
                        break;
                    case 350:
                        loc = Uri.parse("geo:0,0?q=15.7399444444444,74.0261111111111(Location 350)");
                        break;
                    case 351:
                        loc = Uri.parse("geo:0,0?q=15.7387777777778,74.0244166666667(Location 351)");
                        break;
                    case 352:
                        loc = Uri.parse("geo:0,0?q=15.7378888888889,74.0227777777778(Location 352)");
                        break;
                    case 353:
                        loc = Uri.parse("geo:0,0?q=15.7364166666667,74.0201944444444(Location 353)");
                        break;
                    case 354:
                        loc = Uri.parse("geo:0,0?q=15.7315555555556,74.0195555555556(Location 354)");
                        break;
                    case 355:
                        loc = Uri.parse("geo:0,0?q=15.7299166666667,74.0187222222222(Location 355)");
                        break;
                    case 356:
                        loc = Uri.parse("geo:0,0?q=15.7261666666667,74.0168055555555(Location 356)");
                        break;
                    case 357:
                        loc = Uri.parse("geo:0,0?q=15.7238888888889,74.01425(Location 357)");
                        break;
                    case 358:
                        loc = Uri.parse("geo:0,0?q=15.7209444444444,74.0108333333333(Location 358)");
                        break;
                    case 359:
                        loc = Uri.parse("geo:0,0?q=15.7184444444444,74.0080833333333(Location 359)");
                        break;
                    case 360:
                        loc = Uri.parse("geo:0,0?q=15.71625,74.0046666666667(Location 360)");
                        break;
                    case 361:
                        loc = Uri.parse("geo:0,0?q=15.7152583333333,74.002075(Location 361)");
                        break;
                    case 362:
                        loc = Uri.parse("geo:0,0?q=15.7132972222222,73.9984805555556(Location 362)");
                        break;
                    case 363:
                        loc = Uri.parse("geo:0,0?q=15.71175,73.9959722222222(Location 363)");
                        break;
                    case 364:
                        loc = Uri.parse("geo:0,0?q=15.7100277777778,73.9933888888889(Location 364)");
                        break;
                    case 365:
                        loc = Uri.parse("geo:0,0?q=15.7079444444444,73.9903611111111(Location 365)");
                        break;
                    case 366:
                        loc = Uri.parse("geo:0,0?q=15.7066666666667,73.9884722222222(Location 366)");
                        break;
                    case 367:
                        loc = Uri.parse("geo:0,0?q=15.7052222222222,73.9861388888889(Location 367)");
                        break;
                    case 368:
                        loc = Uri.parse("geo:0,0?q=15.7032777777778,73.9833611111111(Location 368)");
                        break;
                    case 369:
                        loc = Uri.parse("geo:0,0?q=15.7016388888889,73.9809166666667(Location 369)");
                        break;
                    case 370:
                        loc = Uri.parse("geo:0,0?q=15.6995833333333,73.9777777777778(Location 370)");
                        break;
                    case 371:
                        loc = Uri.parse("geo:0,0?q=15.6981666666667,73.9756111111111(Location 371)");
                        break;
                    case 372:
                        loc = Uri.parse("geo:0,0?q=15.6963055555556,73.9728888888889(Location 372)");
                        break;
                    case 373:
                        loc = Uri.parse("geo:0,0?q=15.6896944444444,73.9696111111111(Location 373)");
                        break;
                    case 374:
                        loc = Uri.parse("geo:0,0?q=15.6941944444444,73.9663888888889(Location 374)");
                        break;
                    case 375:
                        loc = Uri.parse("geo:0,0?q=15.69325,73.9632777777778(Location 375)");
                        break;
                    case 376:
                        loc = Uri.parse("geo:0,0?q=15.6922277777778,73.9601083333333(Location 376)");
                        break;
                    case 377:
                        loc = Uri.parse("geo:0,0?q=15.6887222222222,73.9581388888889(Location 377)");
                        break;
                    case 378:
                        loc = Uri.parse("geo:0,0?q=15.68575,73.9558888888889(Location 378)");
                        break;
                    case 379:
                        loc = Uri.parse("geo:0,0?q=15.6841388888889,73.9534444444444(Location 379)");
                        break;
                    case 380:
                        loc = Uri.parse("geo:0,0?q=15.6820277777778,73.9504166666667(Location 380)");
                        break;
                    case 381:
                        loc = Uri.parse("geo:0,0?q=15.6805,73.9481111111111(Location 381)");
                        break;
                    case 382:
                        loc = Uri.parse("geo:0,0?q=15.6788888888889,73.9458055555556(Location 382)");
                        break;
                    case 383:
                        loc = Uri.parse("geo:0,0?q=15.6766666666667,73.9416111111111(Location 383)");
                        break;
                    case 384:
                        loc = Uri.parse("geo:0,0?q=15.6752222222222,73.9388611111111(Location 384)");
                        break;
                    case 385:
                        loc = Uri.parse("geo:0,0?q=15.6734722222222,73.9356944444445(Location 385)");
                        break;
                    case 386:
                        loc = Uri.parse("geo:0,0?q=15.6722777777778,73.9328611111111(Location 386)");
                        break;
                    case 387:
                        loc = Uri.parse("geo:0,0?q=15.6710555555556,73.9299444444444(Location 387)");
                        break;
                    case 388:
                        loc = Uri.parse("geo:0,0?q=15.6699722222222,73.92725(Location 388)");
                        break;
                    case 389:
                        loc = Uri.parse("geo:0,0?q=15.6688611111111,73.9244166666667(Location 389)");
                        break;
                    case 390:
                        loc = Uri.parse("geo:0,0?q=15.6680277777778,73.9224166666667(Location 390)");
                        break;
                    case 391:
                        loc = Uri.parse("geo:0,0?q=15.6668055555556,73.9192777777778(Location 391)");
                        break;
                    case 392:
                        loc = Uri.parse("geo:0,0?q=15.6659722222222,73.916(Location 392)");
                        break;
                    case 393:
                        loc = Uri.parse("geo:0,0?q=15.66525,73.9134444444445(Location 393)");
                        break;
                    case 394:
                        loc = Uri.parse("geo:0,0?q=15.6655277777778,73.9101944444445(Location 394)");
                        break;
                    case 395:
                        loc = Uri.parse("geo:0,0?q=15.6641944444444,73.9068888888889(Location 395)");
                        break;
                    case 396:
                        loc = Uri.parse("geo:0,0?q=15.6628055555556,73.9034444444444(Location 396)");
                        break;
                    case 397:
                        loc = Uri.parse("geo:0,0?q=15.6616111111111,73.9003888888889(Location 397)");
                        break;
                    case 398:
                        loc = Uri.parse("geo:0,0?q=15.6603888888889,73.8971666666667(Location 398)");
                        break;
                    case 399:
                        loc = Uri.parse("geo:0,0?q=15.6594444444444,73.8946666666667(Location 399)");
                        break;
                    case 400:
                        loc = Uri.parse("geo:0,0?q=15.6583611111111,73.8919166666667(Location 400)");
                        break;
                    case 401:
                        loc = Uri.parse("geo:0,0?q=15.6571388888889,73.8886666666667(Location 401)");
                        break;
                    case 402:
                        loc = Uri.parse("geo:0,0?q=15.6558333333333,73.88525(Location 402)");
                        break;
                    case 403:
                        loc = Uri.parse("geo:0,0?q=15.6545555555556,73.8818888888889(Location 403)");
                        break;
                    case 404:
                        loc = Uri.parse("geo:0,0?q=15.6533333333333,73.87875(Location 404)");
                        break;
                    case 405:
                        loc = Uri.parse("geo:0,0?q=15.6525555555556,73.8758333333333(Location 405)");
                        break;
                    case 406:
                        loc = Uri.parse("geo:0,0?q=15.6517777777778,73.8728888888889(Location 406)");
                        break;
                    case 407:
                        loc = Uri.parse("geo:0,0?q=15.6509166666667,73.8697777777778(Location 407)");
                        break;
                    case 408:
                        loc = Uri.parse("geo:0,0?q=15.6495,73.86725(Location 408)");
                        break;
                    case 409:
                        loc = Uri.parse("geo:0,0?q=15.6478888888889,73.8649444444444(Location 409)");
                        break;
                    case 410:
                        loc = Uri.parse("geo:0,0?q=15.6462777777778,73.8631111111111(Location 410)");
                        break;
                    case 411:
                        loc = Uri.parse("geo:0,0?q=15.6448333333333,73.8600555555555(Location 411)");
                        break;
                    case 412:
                        loc = Uri.parse("geo:0,0?q=15.6430833333333,73.8566666666667(Location 412)");
                        break;
                    case 413:
                        loc = Uri.parse("geo:0,0?q=15.6417777777778,73.8536666666667(Location 413)");
                        break;
                    case 414:
                        loc = Uri.parse("geo:0,0?q=15.6406388888889,73.8512777777778(Location 414)");
                        break;
                    case 415:
                        loc = Uri.parse("geo:0,0?q=15.6396944444444,73.84925(Location 415)");
                        break;
                    case 416:
                        loc = Uri.parse("geo:0,0?q=15.6381944444444,73.8461388888889(Location 416)");
                        break;
                    case 417:
                        loc = Uri.parse("geo:0,0?q=15.6368055555556,73.8431388888889(Location 417)");
                        break;
                    case 418:
                        loc = Uri.parse("geo:0,0?q=15.6338888888889,73.8416666666667(Location 418)");
                        break;
                    case 419:
                        loc = Uri.parse("geo:0,0?q=15.6318888888889,73.8406388888889(Location 419)");
                        break;
                    case 420:
                        loc = Uri.parse("geo:0,0?q=15.6315277777778,73.838(Location 420)");
                        break;
                    case 421:
                        loc = Uri.parse("geo:0,0?q=15.6309166666667,73.8333888888889(Location 421)");
                        break;
                    case 422:
                        loc = Uri.parse("geo:0,0?q=15.6316666666667,73.8313333333333(Location 422)");
                        break;
                    case 423:
                        loc = Uri.parse("geo:0,0?q=15.6324722222222,73.8292777777778(Location 423)");
                        break;
                    case 424:
                        loc = Uri.parse("geo:0,0?q=15.6334444444444,73.8273333333333(Location 424)");
                        break;
                    case 425:
                        loc = Uri.parse("geo:0,0?q=15.6358611111111,73.8255(Location 425)");
                        break;
                    case 426:
                        loc = Uri.parse("geo:0,0?q=15.6379722222222,73.8237222222222(Location 426)");
                        break;
                    case 427:
                        loc = Uri.parse("geo:0,0?q=15.6397777777778,73.8222777777778(Location 427)");
                        break;
                    case 428:
                        loc = Uri.parse("geo:0,0?q=15.6404444444444,73.8212777777778(Location 428)");
                        break;

                }


                Intent locIntent = new Intent(Intent.ACTION_VIEW);
                locIntent.setData(loc);

                if (locIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(locIntent);

                }
            } else {

                Context context = getApplicationContext();
                CharSequence text = "Invalid Location (Location data available for 1 to 428 only)";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }


        }



    }


}
