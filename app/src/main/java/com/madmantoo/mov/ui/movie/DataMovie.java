package com.madmantoo.mov.ui.movie;

import java.util.ArrayList;

public class DataMovie {

    public static String[][] data = new String[][]{
            {"Aqua Man",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    "https://image.tmdb.org/t/p/w1280/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg",
                    "Action",
                    "124 menit",
                    "James Wan",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/9QusGjxcYvfPD1THg6oW3RLeNn7.jpg",
                    "Jason Momoa, Amber Heard, Willem Dafoe, Patrick Wilson, Nicole Kidman"
            },
            {"Avengers Infinity War",
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    "https://image.tmdb.org/t/p/w1280/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                    "Action",
                    "149 menit",
                    "Joe Russo",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg",
                    "Robert Downey Jr, Chris Hemsworth, Chris Evans, Mark Ruffalo, Scarlett Johansson"
            },
            {"Boheiman",
                    "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                    "https://image.tmdb.org/t/p/w1280/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
                    "Drama",
                    "135 menit",
                    "Bryan Singer",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/93xA62uLd5CwMOAs37eQ7vPc1iV.jpg",
                    "Rami Malek, Gwilym Lee, Ben Hardy, Joseph Mazzello, Lucy Boynton"

            },
            {"Bumblebee",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    "https://image.tmdb.org/t/p/w1280/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg",
                    "Action",
                    "121 menit",
                    "Travis Knight",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/hMANgfPHR1tRObNp2oPiOi9mMlz.jpg",
                    "Hailee Steinfeld, Jorge Lendeborg Jr, Jhon Cena, Jason Ian Drucker, Pamela Adlon"
            },
            {"Deadpool 2",
                    "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boys life.",
                    "https://image.tmdb.org/t/p/w1280/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg",
                    "Action",
                    "129 menit",
                    "David Leitch",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/3P52oz9HPQWxcwHOwxtyrVV1LKi.jpg",
                    "Ryan Reynolds, Josh Brolin, Morena Baccarin, Julian Dennison, Zazie Beetz"
            },
            {"Fantastic Beasts",
                    "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                    "https://image.tmdb.org/t/p/w1280/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
                    "Action",
                    "134 menit",
                    "JK Rowling",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/qrtRKRzoNkf5vemO9tJ2Y4DrHxQ.jpg",
                    "Eddie Redmayne, Katherine Waterston, Alison Sudol, Johnny Depp, Jude Law"
            },
            {"Ip Man 4 The Finale",
                    "Following the death of his wife, Ip Man travels to San Francisco to ease tensions between the local kung fu masters and his star student, Bruce Lee, while searching for a better future for his son.",
                    "https://image.tmdb.org/t/p/w1280/yJdeWaVXa2se9agI6B4mQunVYkB.jpg",
                    "Action",
                    "114 menit",
                    "Wilson Yip",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/ekP6EVxL81lZ4ivcqPsoZ72rY0h.jpg",
                    "Donnie Yen, Wu Yue, Vanness Wu, Scott Adkins, Danny Chan Kwok-Kwan"
            },
            {"Jurassic World",
                    "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again.",
                    "https://image.tmdb.org/t/p/w1280/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg",
                    "Action Drama",
                    "91 menit",
                    "JA Bayona",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/3s9O5af2xWKWR5JzP2iJZpZeQQg.jpg",
                    "Chris Pratt, Bryce Dallas Howard, Rafe Spall, Justice Smith, Daniella Pineda"
            },
            {"A Quite Place",
                    "A family is forced to live in silence while hiding from creatures that hunt by sound.",
                    "https://image.tmdb.org/t/p/w1280/nAU74GmpUk7t5iklEp3bufwDq4n.jpg",
                    "Horor",
                    "117 menit",
                    "John Krasinski",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/roYyPiQDQKmIKUEhO912693tSja.jpg",
                    "Emily Blunt, John Krasinski, Millicent Simmonds, Noah Jupe, Cade Woodward"
            },
            {"Spider-Man: Into the Spider Verse",
                    "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    "https://image.tmdb.org/t/p/w1280/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
                    "Action",
                    "112 menit",
                    "Peter Ramsey",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/uUiId6cG32JSRI6RyBQSvQtLjz2.jpg",
                    "Shameik Moore, Jake Johnson, Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry"
            },
            {"The Nun",
                    "When a young nun at a cloistered abbey in Romania takes her own life, a priest with a haunted past and a novitiate on the threshold of her final vows are sent by the Vatican to investigate. Together they uncover the order’s unholy secret. Risking not only their lives but their faith and their very souls, they confront a malevolent force in the form of the same demonic nun that first terrorized audiences in “The Conjuring 2” as the abbey becomes a horrific battleground between the living and the damned.",
                    "https://image.tmdb.org/t/p/w1280/sFC1ElvoKGdHJIWRpNB3xWJ9lJA.jpg",
                    "Horor",
                    "96 menit",
                    "Gary Dauberman",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/fgsHxz21B27hOOqQBiw9L6yWcM7.jpg",
                    "Demián Bichir, Taissa Farmiga, Jonas Bloquet, Bonnie Aarons, Ingrid Bisu"
            },
            {"Venom",
                    "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                    "https://image.tmdb.org/t/p/w1280/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg",
                    "Action",
                    "116 menit",
                    "Ruben Fleischer",
                    "https://image.tmdb.org/t/p/w1066_and_h600_bestv2/VuukZLgaCrho2Ar8Scl9HtV3yD.jpg",
                    "Tom Hardy, Michelle Williams, Riz Ahmed, Scott Haze, Reid Scott"
            }
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] mData : data) {
            Movie movie = new Movie();
            movie.setmName(mData[0]);
            movie.setmDesc(mData[1]);
            movie.setmPoster(mData[2]);
            movie.setmGenre(mData[3]);
            movie.setmDuration(mData[4]);
            movie.setmDirection(mData[5]);
            movie.setmBanner(mData[6]);
            movie.setmCast(mData[7]);
            list.add(movie);
        }
        return list;
    }
}
