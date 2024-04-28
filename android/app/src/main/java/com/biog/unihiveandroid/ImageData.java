package com.biog.unihiveandroid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;

public class ImageData implements Parcelable {
    private final int imageId;
    private final Context context;

    public ImageData(int imageId, Context context) {
        this.imageId = imageId;
        this.context = context;
    }

    protected ImageData(Parcel in) {
        imageId = in.readInt();
        context = in.readParcelable(Context.class.getClassLoader());
    }

    public static final Creator<ImageData> CREATOR = new Creator<ImageData>() {
        @Override
        public ImageData createFromParcel(Parcel in) {
            return new ImageData(in);
        }

        @Override
        public ImageData[] newArray(int size) {
            return new ImageData[size];
        }
    };

    public int getImageId() {
        return imageId;
    }

    public int getWidth() {
        Drawable drawable = ContextCompat.getDrawable(context, imageId);
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0; // Return default width if drawable is null
    }

    public int getHeight() {
        Drawable drawable = ContextCompat.getDrawable(context, imageId);
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0; // Return default height if drawable is null
    }

    public float getAspectRatio() {
        int width = getWidth();
        int height = getHeight();
        return height != 0 ? (float) width / height : 0;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeParcelable((Parcelable) context, flags);
    }

    public static List<Integer> getTrendingEventsSwitcherItems() {
        List<Integer> switcherItems = new ArrayList<>();
        switcherItems.add(R.drawable.itholic_banner);
        switcherItems.add(R.drawable.aiday_banner);
        switcherItems.add(R.drawable.japanday_banner);
        switcherItems.add(R.drawable.cindhconvoi_banner);
        switcherItems.add(R.drawable.fintech_banner);
        switcherItems.add(R.drawable.forum_ehtp_banner);
        switcherItems.add(R.drawable.forum_ensias_banner);
        switcherItems.add(R.drawable.ideh_banner);
        switcherItems.add(R.drawable.sghiour_meetup_inpt_banner);
        switcherItems.add(R.drawable.olympiades_ensias_banner);
        return switcherItems;
    }

    public static List<Integer> getClubsGridItems() {
        List<Integer> gridItems = new ArrayList<>();
        gridItems.add(R.drawable.eitc_logo);
        gridItems.add(R.drawable.cje_logo);
        gridItems.add(R.drawable.eaic_logo);
        gridItems.add(R.drawable.cindh_logo);
        gridItems.add(R.drawable.cit_logo);
        gridItems.add(R.drawable.fintech_logo);
        gridItems.add(R.drawable.forum_ehtp_logo);
        gridItems.add(R.drawable.oly_ensias_logo);
        gridItems.add(R.drawable.forum_geni_entreprise_logo);
        gridItems.add(R.drawable.cse_logo);
        return gridItems;
    }

    public static List<Integer> getUpcomingEventsGridItems() {
        List<Integer> gridItems = new ArrayList<>();
        gridItems.add(R.drawable.itholic_post_square);
        gridItems.add(R.drawable.fintech_post_square);
        gridItems.add(R.drawable.aiday_post_square);
        gridItems.add(R.drawable.oly_ensias_post_square);
        gridItems.add(R.drawable.japanday_post_square);
        gridItems.add(R.drawable.cindhconvoi_post_square);
        gridItems.add(R.drawable.insec_mcsc_post_square);
        return gridItems;
    }
}


