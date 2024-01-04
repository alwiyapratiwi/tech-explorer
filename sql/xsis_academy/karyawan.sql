create database DBKaryawan;

create table karyawan (
	id serial primary key not null,
	nomor_induk char(7) unique not null,
	nama varchar(30) not null,
	alamat text not null,
	tanggal_lahir date not null,
	tanggal_masuk date not null
);

create table cuti_karyawan (
	id serial primary key not null,
	nomor_induk char(7) not null references karyawan(nomor_induk),
	tanggal_mulai date not null,
	lama_cuti smallint not null,
	keterangan text not null
);

insert into karyawan (nomor_induk, nama, alamat, tanggal_lahir, tanggal_masuk) values 
('IP06001', 'Agus', 'Jln. Gajah Mada 115A, Jakarta Pusat', '1970-08-01', '2006-07-07');

insert into karyawan (nomor_induk, nama, alamat, tanggal_lahir, tanggal_masuk) values 
('IP06002', 'Amin', 'Jln. Bungur Sari v No. 178, Bandung', '1977-05-03', '2006-07-06'),
('IP06003', 'Yusuf', 'Jln. Yosodpuro 15, Surabaya', '1973-08-09', '2006-07-08'),
('IP06004', 'Alyssa', 'Jln. Cendana No. 6, Bandung', '1983-02-14', '2007-01-05'),
('IP06005', 'Maulana', 'Jln. Ampera Raya No. 1', '1985-10-10', '2007-02-05'),
('IP06006', 'Afika', 'Jln. Pejaten Barat No. 6A', '1987-03-09', '2007-06-09'),
('IP06007', 'James', 'Jln. Padjajaran No. 111, Bandung', '1988-05-19', '2006-06-09'),
('IP06008', 'Octavanus', 'Jln. Gajah Mada 101, Semarang', '1988-10-07', '2008-08-08'),
('IP06009', 'Nugroho', 'Jln. Duren Tiga 196, Jakarta Selatan', '1988-01-20', '2008-11-11'),
('IP06010', 'Raisa', 'Jln. Nangka, Jakarta Selatan', '1989-12-29', '2009-02-09');

select * from karyawan;

insert into cuti_karyawan (nomor_induk, tanggal_mulai, lama_cuti, keterangan) values 
('IP06001', '2012-02-01', 3, 'Acara Keluar'),
('IP06001', '2012-02-13', 4, 'Anak Sakit'),
('IP06007', '2012-02-15', 2, 'Nenek Sakit'),
('IP06003', '2012-02-17', 1, 'Mendaftar sekolah anak'),
('IP06006', '2012-02-20', 5, 'Menikah'),
('IP06004', '2012-02-27', 1, 'Imunisasi Anka');

select * from cuti_karyawan;

-- 1. menampilkan 3 karyawan yang pertama kali masuk
select nama, tanggal_masuk from karyawan order by tanggal_masuk limit 3;

-- 2. menampilkan daftar karyawan yang saat ini sedang cuti, daftar berisi nomor_induk, nama, tanggal_mulai, lama_cuti dan
-- 		keterangan, tanggal sekarang 2012-01-16
select 
ck.nomor_induk,
k.nama,
ck.tanggal_mulai,
ck.lama_cuti,
ck.keterangan
from cuti_karyawan ck
join karyawan k on k.nomor_induk = ck.nomor_induk
where '2012-02-16'
between ck.tanggal_mulai and ck.tanggal_mulai + (ck.lama_cuti-1);

-- 3. menampilkan daftar karyawan yang sudah cuti lebih dari satu kali, daftar berisi no_induk, nama,
-- jumlah (berapa kali cuti)


select k.nomor_induk, k.nama, count(lama_cuti) as jumlah
from cuti_karyawan ck 
join karyawan k on ck.nomor_induk = k.nomor_induk 
group by k.nomor_induk, k.nama 
having count(lama_cuti) > 1

-- 4. menampilkan sisa cuti tiap karyawan tahun ini, jika diketahui jatah cuti setiap karyawan tahun ini = 12
-- 		nomor_induk, nama, sisa_cuti

select k.nomor_induk, k.nama,
coalesce((12-sum(ck.lama_cuti)), 12) as sisa_cuti
from karyawan k left join cuti_karyawan ck on k.nomor_induk = ck.nomor_induk 
group by k.nomor_induk, k.nama order by sisa_cuti desc;


-- 5. gabungkan nama karyawan dan nomor induk jadi 1, serta urutkan nama berdasarkan nama karyawan dan nomor induk
select concat (nama, ' ', nomor_induk) from karyawan order by nama, nomor_induk;













