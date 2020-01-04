package aldi.krobok.submissiondicoding;

import java.util.ArrayList;

public class ProcieDetail {
    private static String[] procieNames = {
            "Nehalem",
            "Sandy Bridge",
            "Ivy bridge",
            "Haswell",
            "Broadwell",
            "Sky Lake",
            "Kaby Lake",
            "Coffed Lake",
            "Coffee Lake Refresh",
            "Ice Lake"
    };

    private static String[] procieDetails = {
            "Ada perubahan dari seri pendahulunya yaitu penggabungan komponen ke dalam chip prosesor Controller RAM DDR3 langsung dari prosesor. Selain itu Nehalem ini masih menggunakan teknologi fabrikasi 45 nm. Jadi maklum lah kalo generasi Nehalem ini terasa agak lambat karena memang sudah terlalu tua. (TS juga pakai laptop dengan Generasi Nehalem).",
            "Pada tahun 2011 diluncurkan generasi ke-2 untuk Intel Core yaitu Arsitektur Sandy Bridge. Teknologi Sandy BridgeSudah suport dengan teknik fabrikasi 32 nm dan salah satu fitur barunya adalah adanya vga di prosesor ini. Kalo di AMD mungkin namanya APU atau Fusion.",
            "Generasi ke-3 dari Intel Core adalah arsitektur Ivy Bridge yang merupakan generasi \"Tock\" dari Sandy Bridge. Perubahan mendasar pada teknologi ini adalah penggunaan fabrikasi 22 nm sehingga efisiansi daya listrik jauh lebih besar dari yang sebelumnya. Pada arsitektur ini juga Intel menambahkan dukungan untuk USB 3.0 dan PCI Express 3.0.",
            "Haswell adalah procesor Intel generasi ke-4 yang diluncurkan pada tahun 2013, memiliki fitur baru internal VGA (GPU) lebih cepat. prosesor Sandy Bridge cuma dibuat sampai 3.3-3.4Ghz saja. Sedangkan Ivy Bridge dan Haswell berada di atas 3.4Ghz.",
            "Diresmikan pada tahun 2014, Broadwell adalah arsitektur generasi ke-5. Broadwell merupakan generasi \"Tick\" dari Haswell, dimana memiliki fabrikasi 14 nm. Dengan mengecilnya “penampang” pada Intel generasi 5 ini,membuat konsumsi daya makin kecil. Namun memliki performa yang lebih baik 5-20% dari generasi sebelumnya. Sama dengan Haswell, Broadwell menggunakan socket LGA 1150 dan LGA 2011-v3.",
            "Intel resmi meluncurkan prosesor Core-i generasi ke-6 pada September 2015. Sama seperti arsitektur sebelumnya, Skylake menggunakan teknologi fabrikasi 14 nm. Ada teknologi  baru dari prosesor ini, dengan teknologi yang dinamakan \"speed shift\" memungkinkan prosesor untuk bekerja lebih cepat tapi juga menghemat daya. Skylake menigkatkan performa hingga 50% dari generasi sebelumnya dan menghemat streaming video 4K.",
            "Intel generasi ke-7 ini diluncurkan secara resmi pada Agustus 2016. Sama seperti 2 generasi sebelumnya, Kaby Lake menggunakan teknologi fabrikasi 14 nm. Performanya meningkat sekitar 12% jika dibandingkan dengan Skylake.Intel Core Generasi ke-7 ini dapat menciptakan pengalaman multimedia yang maksimal. Pengguna dapat merasakan peningkatan grafis dalam bermain game populer dan paling baru, dan menjalankan video 4K dengan lancar tanpa mengalami penurunan fps.",
            "Coffee lake resmi diluncurkan pada Oktober 2017. Ini merupakan PAO (Process-Architecture-Optimization) dari Kaby Lake. Masih sama, Coffee Lake memakai teknologi fabrikasi 14 nm, namun pada versi mobile generasi ke-8 sudah menggunakan fabrikasi 10 nm. Performa tentunya meningkat dibandingkan generasi pendahulunya.Salah satu keunggulan dibandingkan generasi sebelumnya adalah jumlah core yang meningkat. Contohnya Core i3, yang sebelumnya hanya punya dua inti, kini menjadi empat inti. Sementara untuk Core i5 kini mempunyai enam 6, dan Core i7 juga punya enam inti dengan dukungan hyperthreading.",
            "Intel 9th Gen untuk desktop PC resmi dirilis kemarin atau tepatnya tanggal 5 oktober 2018. Meskipun kami hanya melihat sajian acara sederhana melalui Live streaming, namun mereka benar-benar memperkenalkan secara lengkap barisan CPU terbaru yang memilik kode nama Coffee Lake Refresh ini. Ada 3 segmen utama yang bisa kami ungkapkan dalam acara 2018 Intel Desktop Launch Event tersebut, dimana akan kami jelaskan lebih detail dibawah ini. Salah satu yang menjadi harapan terbesar penggemar tentu saja kehadiran Prosesor mainstream Intel Core i9-9900k seri, yang bisa menjadi harapan baru bagi penggemar, terlebih lagi potensi yang bisa disajikan CPU tersebut.",
            "Pada prosesor terbarunya ini, Intel memberikan sejumlah perombakkan pada arsitektur CPU dan GPU (UHD/HD Graphics). Prosesor tersebut kini menggunakan arsitektur dengan sebutan Sunny Cove yang diklaim menawarkan tingkat IPC (Instruction Per Cycle) 18 persen lebih tinggi dibandingkan pendahulunya, Skylake. Kemampuan kalkulasi A.I (Artificial Intelligence) juga ditingkatkan berkat implementasi teknologi Intel DL Boost. Tak hanya itu, performa grafis IGP pada Core i 10th Gen juga meningkat karena dibantu dengan penggunaan arsitektur GPU Gen 11."
    };

    private static int[] prociesImages = {
            R.drawable.pertama,
            R.drawable.kedua,
            R.drawable.ketiga,
            R.drawable.keempat,
            R.drawable.kelima,
            R.drawable.keenam,
            R.drawable.ketujuh,
            R.drawable.kedelapan,
            R.drawable.kesembilan,
            R.drawable.kesepuluh
    };

    private static String[] id = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    static ArrayList<Procie> getListData() {
        ArrayList<Procie> list = new ArrayList<>();
        for (int position = 0; position < procieNames.length; position++) {
            Procie procie = new Procie();
            procie.setId(Integer.parseInt(id[position]));
            procie.setName(procieNames[position]);
            procie.setDetail(procieDetails[position]);
            procie.setPhoto(prociesImages[position]);
            list.add(procie);
        }
        return list;
    }
}