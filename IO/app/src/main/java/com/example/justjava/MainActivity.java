package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int numCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderMoreCoffee(View view)
    {
        numCoffees++;
        display(numCoffees);
        displayPrice(numCoffees * 5);
    }

    public void decrementCoffeeOrder(View view)
    {
        numCoffees--;
        if (numCoffees < 0)
            numCoffees = 0;
        display(numCoffees);
        displayPrice(numCoffees * 5);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numCoffees);
        displayPrice(numCoffees * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}