package com.madmantoo.mov.ui.tvshow;

import java.util.ArrayList;

public class DataTV {
    public static String[][] data = new String[][]{
            {"Legacies",
                    "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter.",
                    "https://image.tmdb.org/t/p/w1280/1Uhoi348GEg4DObGrVLNUqtKtdu.jpg",
                    "Drama",
                    "43 menit",
                    "Julie Plec",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/tIYb76SgqjUJ6XLFwBrk4gvGNtn.jpg",
                    "Danielle Rose Russell, Aria Shahghasemi, Matthew Davis"
            },
            {"The Resident",
                    "A tough, brilliant senior resident guides an idealistic young doctor through his first day, pulling back the curtain on what really happens, both good and bad, in modern-day medicine.",
                    "https://image.tmdb.org/t/p/w1280/k1Df8EkXpsEogBj1FXbLfn2mm4i.jpg",
                    "Drama",
                    "42 menit",
                    "Amy Holden Jones",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/9TBjutUx4lBFS2tgHaQJuue7lAF.jpg",
                    "Matt Czuchry, Manish Dayal, Emily VanCamp"
            },
            {"Killing Eve",
                    "A security consultant hunts for a ruthless assassin. Equally obsessed with each other, they go head to head in an epic game of cat-and-mouse.",
                    "https://image.tmdb.org/t/p/w1280/cmLJFWOklp4PpUkUfeCFIKntbTH.jpg",
                    "Kejahatan",
                    "43 menit",
                    "Sandra Oh",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/rfJc5ngaPD1tVtdoscgREw2wLVp.jpg",
                    "Jodie Comer, Fiona Shaw, Owen McDonnell"

            },
            {"FBI",
                    "The elite unit of the New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep New York and the country safe.",
                    "https://image.tmdb.org/t/p/w1280/nKulwcleWvL9Aoa9VLIT0TQpHqC.jpg",
                    "Kejahatan",
                    "43 menit",
                    "Dick Wolf",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/1sMk4Vh6VxGoct7Eu4hC3Ikfd5K.jpg",
                    "Missy Peregrym, Zeeko Zaki, Jeremy Sisto"
            },
            {"Chilling Adventures",
                    "As her 16th birthday nears, Sabrina must choose between the witch world of her family and the human world of her friends. Based on the Archie comic.",
                    "https://image.tmdb.org/t/p/w1280/yxMpoHO0CXP5o9gB7IfsciilQS4.jpg",
                    "Misteri",
                    "60 menit",
                    "Roberto Aguirre-Sacasa",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/8AdmUPTyidDebwIuakqkSt6u1II.jpg",
                    "Kiernan Shipka, Ross Lynch, Lucy Davis"
            },
            {"Manifest",
                    "After landing from a turbulent but routine flight, the crew and passengers of Montego Air Flight 828 discover five years have passed in what seemed like a few hours.",
                    "https://image.tmdb.org/t/p/w1280/1xeiUxShzNn8TNdMqy3Hvo9o2R.jpg",
                    "Misteri",
                    "42 menit",
                    "Robert Zemeckis",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/3ib0uov9Qq9JtTIEGL39irTa3vZ.jpg",
                    "Melissa Roxburgh, Josh Dallas, Parveen Kaur"
            },
            {"The Haunting",
                    "The Crains, a fractured family, confront haunting memories of their old home and the terrifying events that drove them from it.",
                    "https://image.tmdb.org/t/p/w1280/38PkhBGRQtmVx2drvPik3F42qHO.jpg",
                    "Misteri",
                    "50 menit",
                    "Mike Flanagan",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/dQF17lG4OZ3pC4QD9iNjaMS96gO.jpg",
                    "Michiel Huisman, Elizabeth Reaser, Kate Siegel"
            },
            {"The Terror",
                    "A chilling anthology series featuring stories of people in terrifying situations inspired by true historical events.",
                    "https://image.tmdb.org/t/p/w1280/j8lakGwVuPonS2wKNePFy35QbT.jpg",
                    "Drama",
                    "47 menit",
                    "Edward Berger",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/ssyZgYScV9eClakZDwu4sPrgMmy.jpg",
                    "Jared Harris, Ciarán Hinds, Tobias Menzies"
            },
            {"Impulse",
                    "16-year-old Henry Coles is an outsider in her new town of Reston, New York. With a major chip on her shoulder and no friends",
                    "https://image.tmdb.org/t/p/w1280/sMZMj1gCDZA9eZzHpEmDMpQ0Iur.jpg",
                    "Aksi",
                    "50 menit",
                    "Steven Gould",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/5IBg1NxI0W9vmuCqa4y0AgMSvOT.jpg",
                    "Maddie Hasson, Missi Pyle, Sarah Desjardins"
            },
            {"Lost in Space",
                    "After crash-landing on an alien planet, the Robinson family fights against all odds to survive and escape. ",
                    "https://image.tmdb.org/t/p/w1280/83mK4CnvRPFSqcyO3s3lq6aDy1x.jpg",
                    "Action",
                    "56 menit",
                    "Matt Sazama",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/dCm03Ro8FRKcJIy3P27gPT4uEXD.jpg",
                    "Maxwell Jenkins, Mina Sundwall, Taylor Russell"
            }
    };

    public static ArrayList<TvShow> getListDataTv() {
        ArrayList<TvShow> list = new ArrayList<>();
        for (String[] tvData : data) {
            TvShow tvShow = new TvShow();
            tvShow.setTvName(tvData[0]);
            tvShow.setTvDesc(tvData[1]);
            tvShow.setTvPoster(tvData[2]);
            tvShow.setTvGenre(tvData[3]);
            tvShow.setTvDuration(tvData[4]);
            tvShow.setTvDirection(tvData[5]);
            tvShow.setTvBanner(tvData[6]);
            tvShow.setTvCast(tvData[7]);
            list.add(tvShow);
        }
        return list;
    }
}


