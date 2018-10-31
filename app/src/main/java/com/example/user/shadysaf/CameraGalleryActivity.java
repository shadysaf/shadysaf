package com.example.user.shadysaf;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.FileNotFoundException;

public class CameraGalleryActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int CAMERA_REQUEST = 0;
    ImageView imageView;
    Button btTakePhoto, btGallery;
    Bitmap bitmap;

    private static final int SELECT_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_gallery);

        btGallery = findViewById(R.id.btGallery);
        btGallery.setOnClickListener(this);

        btTakePhoto = findViewById(R.id.btTakephoto);
        btTakePhoto.setOnClickListener(this);

        imageView=findViewById(R.id.imageView2);
    }

    public void onClick(View view){
        if(view == btTakePhoto) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);
        }else {
            Intent i = new
            Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i,SELECT_IMAGE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
     //   if (requestCode == CAMERA_REQUEST && requestCode == Activity.RESULT_OK){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);

    //    }
         if(requestCode == SELECT_IMAGE && requestCode == Activity.RESULT_OK){
            Uri targetUri = data.getData();
            try{
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }

    }

}
