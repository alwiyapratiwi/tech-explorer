-- SQL BASIC

-- 1. Cek tabel umkm_jabar
SELECT * FROM umkm_jabar;

-- 2. Tunjukkan data umkm di Kota Bandung
SELECT * FROM umkm_jabar WHERE nama_kabupaten_kota = "KOTA BANDUNG";

-- 3. Tunjukkan data umkm dari tahun 2019 dan disusun berdasarkan kategori_usaha
SELECT * FROM umkm_jabar WHERE tahun >= 2019 ORDER BY kategori_usaha, tahun;

-- 4. soal no 3 dibatasi row nya s.d. 10
SELECT * FROM umkm_jabar WHERE tahun >= 2019 ORDER BY kategori_usaha, tahun LIMIT 10;

-- 5. kategori_usaha apa saja yang tersedia di dalam dataset
SELECT DISTINCT kategori_usaha FROM umkm_jabar;

-- 6. tunjukkan seluruh data hanya kategori_usaha fashion dan makanan
SELECT * FROM umkm_jabar WHERE kategori_usaha = "FASHION" OR kategori_usaha = "MAKANAN";
SELECT * FROM umkm_jabar WHERE kategori_usaha IN ("FASHION", "MAKANAN");

-- 7. tunjukkan seluruh data dengan kategori usaha fashion di kabupaten karawang
SELECT * FROM umkm_jabar WHERE kategori_usaha = "FASHION" AND nama_kabupaten_kota = "KABUPATEN KARAWANG";

-- 8. tunjukkan seluruh data selain kaegori usaha kuliner, makanan dan minuman
SELECT * FROM umkm_jabar WHERE kategori_usaha NOT IN ("KULINER", "MAKANAN", "MINUMAN");

-- 9. dari tahun 2018 s.d. 2020 bagaimana tren jumlah umkm di kabupaten tasikmalaya untuk kategori usaha batik
SELECT nama_kabupaten_kota, kategori_usaha, proyeksi_jumlah_umkm, satuan, tahun FROM umkm_jabar
WHERE tahun <= 2020 AND tahun >= 2018 AND nama_kabupaten_kota = "KABUPATEN TASIKMALAYA" AND kategori_usaha = "BATIK";

-- 10. kota bandung, kabupaten bandung dan kabupaten bandung barat, dimana umkm terpusat tahun 2021
SELECT * FROM umkm_jabar WHERE nama_kabupaten_kota LIKE "%BANDUNG%" AND kategori_usaha = "KULINER" AND tahun = 2021;

-- 11. kabupaten/kota mana saja yang memiliki angka 7 pada digit ke 3 kode tersebut
SELECT * FROM umkm_jabar WHERE kode_kabupaten_kota LIKE "__7%";

-- FUNGSI AGGREGATE

-- 1. berapa jumlah baris dari tabel umkm_jabar
SELECT COUNT(*) AS jumlah_baris FROM umkm_jabar;

-- 2. berapa jumlah umkm di kabupaten bekasi pada tahun 2017
SELECT SUM(proyeksi_jumlah_umkm) AS jumlah_umkm_kab_bekasi_2017 FROM umkm_jabar;

-- 3. bagaimana tren jumlah umkm di kabupaten karawang dari tahun 2017 s.d. 2021
SELECT tahun, SUM(proyeksi_jumlah_umkm) AS jumlah_umkm_kab_karawang FROM umkm_jabar
WHERE nama_kabupaten_kota = "KABUPATEN KARAWANG" AND tahun >= 2017 AND tahun <= 2021 GROUP BY tahun;

-- 4. berapa jumlah rata-rata umkm setiap kategori usaha per kabupaten/kota di jawa barat tahun 2021
SELECT tahun, kategori_usaha, AVG(proyeksi_jumlah_umkm) AS rerata_jumlah_umkm FROM umkm_jabar
WHERE tahun = 2021 GROUP BY tahun, kategori_usaha ORDER BY kategori_usaha;

-- 5. nilai minimum dan maksimum dari kolom jumlah_umkm
SELECT MIN(proyeksi_jumlah_umkm) AS min_jumlah_umkm, MAX(proyeksi_jumlah_umkm) AS max_jumlah_umkm from umkm_jabar;

-- 6. kabupaten atau kota apa yang memiliki jumlah umkm kurang dari 100.000 pada tahun 2020
SELECT nama_kabupaten_kota, SUM(proyeksi_jumlah_umkm) AS jumlah_umkm_tahun_2020 FROM umkm_jabar
WHERE tahun = 2020 GROUP BY nama_kabupaten_kota HAVING jumlah_umkm_tahun_2020 < 100000;


