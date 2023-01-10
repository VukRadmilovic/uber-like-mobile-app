package com.example.uberapp_tim9.passenger.ride_history;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.uberapp_tim9.R;
import com.example.uberapp_tim9.passenger.ride_history.adapters.PassengerRideAdapter;
import com.example.uberapp_tim9.passenger.ride_history.adapters.PassengerRideDriverAdapter;
import com.example.uberapp_tim9.passenger.ride_history.adapters.PassengerRidePassengersAdapter;
import com.example.uberapp_tim9.passenger.ride_history.adapters.PassengerRideReviewAdapter;
import com.example.uberapp_tim9.passenger.ride_history.adapters.PassengerRidesAdapter;

public class PassengerRideDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_ride_details);

        setSupportActionBar(findViewById(R.id.toolbarRideDetails));
        ActionBar toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayShowTitleEnabled(false);

        PassengerRideAdapter rideInfoAdapter = new PassengerRideAdapter();
        RecyclerView rideInfo = findViewById(R.id.ride_info);
        LinearLayoutManager rideInfoLlm = new LinearLayoutManager(getApplicationContext());
        rideInfo.setLayoutManager(rideInfoLlm);
        rideInfo.setAdapter(rideInfoAdapter);

        PassengerRidePassengersAdapter passengerAdapter = new PassengerRidePassengersAdapter();
        RecyclerView passengerList = findViewById(R.id.passengerList);
        LinearLayoutManager passengersLlm = new LinearLayoutManager(getApplicationContext());
        passengerList.setLayoutManager(passengersLlm);
        passengerList.setAdapter(passengerAdapter);

        PassengerRideDriverAdapter driverAdapter = new PassengerRideDriverAdapter();
        RecyclerView driverList = findViewById(R.id.driversList);
        LinearLayoutManager driversLlm = new LinearLayoutManager(getApplicationContext());
        driverList.setLayoutManager(driversLlm);
        driverList.setAdapter(driverAdapter);

        PassengerRideReviewAdapter reviewAdapter = new PassengerRideReviewAdapter();
        RecyclerView reviewList = findViewById(R.id.reviewList);
        LinearLayoutManager reviewsLlm = new LinearLayoutManager(getApplicationContext());
        reviewList.setLayoutManager(reviewsLlm);
        reviewList.setAdapter(reviewAdapter);

        Button messageButton = findViewById(R.id.messagesButton);
        messageButton.setOnClickListener(v -> {
            Toast.makeText(getBaseContext(), "Referenca ka inboxu", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        this.finish();
        return super.onOptionsItemSelected(item);
    }
}