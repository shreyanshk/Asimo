package stratos.asimo;

/**
 * Created by Shreyansh Khajanchi on 04-02-2017.
 */

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.UUID;

class BluetoothControl {
    private BluetoothAdapter bluetoothAdapter;
    public BluetoothControl() {
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter != null) {
            if (!bluetoothAdapter.isEnabled()) {
                Intent enableAdapter = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                startActivityForResult(enableAdapter, 0);
            } else {
                //do stuff
            }
        } else if (bluetoothAdapter == null) {
        }
    }


}
