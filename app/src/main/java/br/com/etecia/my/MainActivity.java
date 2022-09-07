package br.com.etecia.my;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    MaterialToolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        drawerLayout = findViewById(R.id.idDrawerLayout);
        navigationView = findViewById(R.id.idNavigationView);

        navigationView.setNavigationItemSelectedListener(this);

        //Clique no menu para abrir e fechar o NavigationView
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout,
                toolbar,
                R.string.opennav,
                R.string.closenav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.idContainerNav, new ImportFragment()).commit();

            navigationView.setCheckedItem(R.id.mImport);
        }


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mreceita:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.idContainerNav, new ImportFragment()).commit();

                break;
            case R.id.msite:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.idContainerNav, new receitas()).commit();
                break;
            case R.id.msair:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.idContainerNav, new bancoFragment()).commit();
                break;

            default:

        }