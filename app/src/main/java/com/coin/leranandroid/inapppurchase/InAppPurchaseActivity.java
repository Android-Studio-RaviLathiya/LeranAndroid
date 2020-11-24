package com.coin.leranandroid.inapppurchase;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anjlab.android.iab.v3.BillingProcessor;
import com.anjlab.android.iab.v3.TransactionDetails;

public class InAppPurchaseActivity extends AppCompatActivity {

    private static final String LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk4RRYg/UdhNY1dso//kPOq+CHNptGK1Pbsz9viEuAw239G+3wxhsOdsfYwC1MA6KluS86Xtvvu3f0UncVZpyd18pb0kt82Qh3taOELUOt+yQTnS6KwhMT1DwhwZe4YvbzWG8kX0Kgyzl86lRqynvJ+cE+A1nnjx0DNWtDiBiBFIFrPtu5u7hTHG89Udy80VaB3/FdjczYFPSZFsQkAj/ky7lfdnctABBVfzQppikH5NHNBHQvjWSS7GyCQSRAEEJlDZZqGbfXZZIbdBtGevbOgSVdP62EAFTJd7LLSvl3t8egMlf3QOtoCfA+5mrDBYSURDL25poTfScZB32eAhXcQIDAQAB";
    private static final String PRODUCT_ID = "bhagvat_gita_month";
    BillingProcessor bp;

    //in app purchase
    public void onBillingError(int i, Throwable th) {
        Toast.makeText(this, "Error " + th, Toast.LENGTH_SHORT).show();
//        Called when BillingProcessor was initialized and it's ready to purchase
    }

    public void onBillingInitialized() {
//        alled when some error occurred. See Constants class for more details

//     Note - this includes handling the case where the user canceled the buy dialog:
//     errorCode = Constants.BILLING_RESPONSE_RESULT_USER_CANCELED
    }

    public void onProductPurchased(String str, TransactionDetails transactionDetails) {
        Toast.makeText(this, "Payment Success Enjoy", Toast.LENGTH_SHORT).show();
//        Called when requested PRODUCT ID was successfully purchased
    }

    public void onPurchaseHistoryRestored() {
//        Called when purchase history was restored and the list of all owned PRODUCT ID's
//                * was loaded from Google Play
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        https://github.com/anjlab/android-inapp-billing-v3

        inapppurchase(InAppPurchaseActivity.this);


    }
    private void inapppurchase(Context context) {

//        BillingProcessor billingProcessor = new BillingProcessor(this, LICENSE_KEY, InAppPurchaseActivity.this);
//        this.bp = billingProcessor;
//        billingProcessor.initialize();

        if (this.bp.isPurchased(PRODUCT_ID)) {
            Toast.makeText(context, "Purches", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Purches Not", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        onBackPressed();
        return true;
    }

    @Override
    protected void onDestroy() {

        BillingProcessor billingProcessor = this.bp;
        if (billingProcessor != null) {
            billingProcessor.release();
        }
        super.onDestroy();
    }

}
