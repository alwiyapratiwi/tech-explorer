create database mahasiswa;

create table type_dosen (
	id serial not null primary key,
	kode_type_dosen char(4),
	deskripsi varchar(30)
);

create table jurusan (
	id serial not null primary key,
	kode_jurusan char(4) ,
	nama_jurusan varchar(30),
	status_jurusan varchar(10)
	
);

alter table jurusan add constraint jurusan_unique_key unique (kode_jurusan);

alter table type_dosen add constraint dosen_unique_key unique (kode_type_dosen);

create table dosen (
	id serial not null primary key, 
	kode_dosen char(4),
	nama_dosen varchar(30),
	kode_jurusan char(4) references jurusan(kode_jurusan),
	kode_type_dosen char(4) references type_dosen(kode_type_dosen)
);

insert into type_dosen (kode_type_dosen, deskripsi) values ('T001', 'Tetap');
insert into type_dosen (kode_type_dosen, deskripsi) values ('T002', 'Honorer'), ('T003', 'Expertise');

select * from type_dosen;

insert into jurusan (kode_jurusan, nama_jurusan, status_jurusan) values 
('J001', 'Teknik Informatika', 'Aktif'),
('J002', 'Management Informatika', 'Aktif'),
('J003', 'Sistem Informasi', 'Non Aktif'),
('J004', 'Sistem Komputer', 'Aktif'),
('J005', 'Komputer Akuntansi', 'Non Aktif');

select * from jurusan;

insert into dosen (kode_dosen, nama_dosen, kode_jurusan, kode_type_dosen) values
('D001', 'Prof. Dr. Retno Wahyuningsih', 'J001', 'T002');

insert into dosen (kode_dosen, nama_dosen, kode_jurusan, kode_type_dosen) values
('D002', 'Prof. M. Sutikno', 'J002', 'T001'),
('D003', 'Prof. Hendri A. Verburgh', 'J003', 'T002'),
('D004', 'Prof. Risma Suparwata', 'J004', 'T002'),
('D005', 'Prof. Amir Sjarifuddin Madjid, MM, MA', 'J005', 'T001');

alter table dosen alter column nama_dosen type varchar(50);

select * from dosen;

create table agama (
	id serial not null primary key,
	kode_agama char(4) UNIQUE,
	deskripsi varchar(10)
);

create table mahasiswa (
	id serial not null primary key,
	kode_mahasiswa char(4) UNIQUE,
	nama_mahasiswa varchar(30),
	alamat varchar(100),
	kode_agama char(4) references agama(kode_agama),
	kode_jurusan char(4) references jurusan(kode_jurusan)
);

create table ujian (
	id serial not null primary key,
	kode_ujian char(4) UNIQUE,
	nama_ujian varchar(20),
	status_ujian varchar(10)
);

create table nilai (
	id serial not null primary key,
	kode_mahasiswa char(4) references mahasiswa(kode_mahasiswa),
	kode_ujian char(4) references ujian(kode_ujian),
	nilai int
);

insert into agama (kode_agama, deskripsi) values 
('A001', 'Islam'),
('A002', 'Kristen'),
('A003', 'Katolik'),
('A004', 'Hindu'),
('A005', 'Budha');

select * from agama;

insert into mahasiswa (kode_mahasiswa, nama_mahasiswa, alamat, kode_agama, kode_jurusan) values
('M001', 'Budi Gunawan', 'Jl. Mawar No 3 RT 05 Cicalengka, Bandung', 'A001', 'J001'),
('M002', 'Rinto Gaharjo', 'Jl. Kebagusan No. 33 RT04 RW06, Bandung', 'A002', 'J002'),
('M003', 'Asep Saepudin', 'Jl. Sumatera No. 12 RT 02 RW 01, Ciamis', 'A001', 'J003'),
('M004', 'M. Hafif Isbullah', 'Jl. Jawa No 01 RT 01 RW 01, Jakarta Pusat', 'A001', 'J001'),
('M005', 'Cahyono', 'Jl. Niagara No. 54 RT01 RW09, Surabaya', 'A003', 'J002');

select * from mahasiswa;

insert into ujian (kode_ujian, nama_ujian, status_ujian) values 
('U001', 'Algoritma', 'Aktif'),
('U002', 'Aljabar', 'Aktif'),
('U003', 'Statistika', 'Non Aktif'),
('U004', 'Etika Profesi', 'Non Aktif'),
('U005', 'Bahasa Inggris', 'Aktif');

select * from ujian;

insert into nilai (kode_mahasiswa, kode_ujian, nilai) values 
('M004', 'U001', 90),
('M001', 'U001', 80),
('M002', 'U003', 85),
('M004', 'U002', 95),
('M005', 'U005', 70);

select * from nilai;

-- DQL
select * from mahasiswa;
select kode_mahasiswa, nama_mahasiswa from mahasiswa;
select kode_mahasiswa, kode_jurusan from mahasiswa where kode_jurusan = 'J001';
select kode_mahasiswa, kode_jurusan from mahasiswa where kode_jurusan = 'J001' or kode_jurusan = 'J003';
select kode_mahasiswa, kode_jurusan, kode_agama from mahasiswa where kode_agama = 'A003' and kode_jurusan = 'J002';
select * from mahasiswa where id > 2;
select * from mahasiswa where id > 1 and id < 3;
select * from mahasiswa where id >= 1 and id <= 3;
select * from mahasiswa where id >= 1 and id <=2 or id = 3;
select * from mahasiswa where id = (2+2); -- hanya contoh tidak baik dilakukan
select * from mahasiswa where kode_mahasiswa = 'M001' and kode_agama = 'A001' and kode_jurusan = 'J001';
select * from mahasiswa where kode_mahasiswa <> 'M001'; -- tampilkan mahasiswa selain M001
select * from mahasiswa where id in (1, 3, 5);
select * from mahasiswa where id not in (1, 3, 5); -- negasi dari in
select * from mahasiswa where id between 1 and 3;
select * from mahasiswa where id not between 1 and 3;
select 1 as _number;
select 'A' as _char;
select 'text' as _string;
select md5('password123') as hashpassword;
select sha256('blue'::bytea) as shapass;
select 'hello world';
select 1, 2, 3;
select * from mahasiswa where id in (select id from mahasiswa where id >= 1 and id <= 3);
select * from mahasiswa where id <= 3 order by id;
select * from mahasiswa order by nama_mahasiswa;
select * from mahasiswa order by nama_mahasiswa desc;
select 'Bogor' as kota, * from mahasiswa;
select (id*5) as id5, * from mahasiswa;
select id, nama_mahasiswa, (id/2) as id5, kode_jurusan from mahasiswa;
select kode_mahasiswa from mahasiswa where nama_mahasiswa = 'Cahyono';
select kode_mahasiswa from mahasiswa where nama_mahasiswa like 'Cahyono';
select kode_mahasiswa, alamat from mahasiswa where alamat like '%Bandung';
select kode_mahasiswa, alamat from mahasiswa where alamat like 'Jl. Mawar%';
select kode_mahasiswa, alamat from mahasiswa where alamat like '%No%';
select kode_mahasiswa, alamat from mahasiswa where alamat like '%Jakarta%';
select kode_mahasiswa, alamat from mahasiswa where alamat ilike '%jakarta%'; -- ilke exclude case sensitive

-- agregasi (aggregate) / menghitung data yang terkelompok
select * from nilai;
select sum(nilai) as total_nilai from nilai;
select sum(nilai) as total_nilai_m004 from nilai where kode_mahasiswa = 'M004';
select avg(nilai) as avg_nilai from nilai;
select avg(nilai) as avg_nilai_m004 from nilai where kode_mahasiswa = 'M004';
select max(nilai) as max_nilai from nilai;
select max(nilai) as max_nilai_m004 from nilai where kode_mahasiswa = 'M004';
select max(nilai) as max_nilai from nilai where nilai <> (select max(nilai) from nilai);
select min(nilai) as min_nilai from nilai;
select min(nilai) as min_nilai_m004 from nilai where kode_mahasiswa = 'M004';
select count(nilai) as banyaknya_nilai from nilai;
select count(nilai) as banyaknya_nilai_m04 from nilai where kode_mahasiswa = 'M004';

-- grouping / pengelompokan
select kode_jurusan, count(kode_jurusan) as jumlah_mahasiswa	-- count(*)
from mahasiswa group by kode_jurusan;
select nama_mahasiswa, kode_jurusan from mahasiswa;
select kode_mahasiswa, sum(nilai) from nilai group by kode_mahasiswa;
select kode_mahasiswa, avg(nilai) from nilai group by kode_mahasiswa;
select kode_mahasiswa, min(nilai) from nilai group by kode_mahasiswa;
select kode_mahasiswa, max(nilai) from nilai group by kode_mahasiswa;

select kode_mahasiswa, avg(nilai) from nilai where nilai > 80 group by kode_mahasiswa;
select kode_mahasiswa, avg(nilai) from nilai where nilai <= 80 group by kode_mahasiswa;
select kode_mahasiswa, avg(nilai) from nilai group by kode_mahasiswa having avg(nilai) < 90;

-- join (menggabungkan table yang berelasi)
select 
m.nama_mahasiswa,
j.nama_jurusan
from mahasiswa m, jurusan j 
where m.kode_jurusan = j.kode_jurusan; 

select 
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m, jurusan j, agama a
where m.kode_jurusan = j.kode_jurusan and m.kode_agama = a.kode_agama; 

-- keyword join

select
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m 
join jurusan j ON m.kode_jurusan = j.kode_jurusan
join agama a ON a.kode_agama = m.kode_agama;

select
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m 
inner join jurusan j ON m.kode_jurusan = j.kode_jurusan
inner join agama a ON a.kode_agama = m.kode_agama;

explain
select
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m 
inner join jurusan j ON m.kode_jurusan = j.kode_jurusan
inner join agama a ON a.kode_agama = m.kode_agama;

select
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m 
left join jurusan j ON m.kode_jurusan = j.kode_jurusan
left join agama a ON a.kode_agama = m.kode_agama;

select
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi
from mahasiswa m 
right join jurusan j ON m.kode_jurusan = j.kode_jurusan
right join agama a ON a.kode_agama = m.kode_agama;	-- melihat jurusan2 yang tidak ada mahasiswa

-- sub query (seperti join dengan membuka table dalam kolom)
select
m.nama_mahasiswa,
(select nama_jurusan from jurusan where kode_jurusan=m.kode_jurusan) as nama_jurusan,
(select deskripsi from agama where kode_agama=m.kode_agama) as agama
from mahasiswa m;

-- union
select kode_mahasiswa, kode_ujian, nilai from nilai
union all
select '' as kode_mahasiswa, 'TOTAL' as kode_ujian, sum(nilai) as nilai from nilai
union all
select '' as kode_mahasiswa, 'AVERAGE' as kode_ujian, avg(nilai) as nilai from nilai;

-- case when
select 
	kode_mahasiswa,
	nilai,
	case when nilai >= 80 then 'Sangat Baik'
		when nilai >= 71 and nilai <= 84 then 'Kurang'
		when nilai >= 50 and nilai <= 70 then 'Gagal'
	end keterangan
from nilai;

drop view view_nilai;

-- view
create or replace view view_nilai as
select 
	kode_mahasiswa,
	nilai,
	case when nilai >= 80 then 'Sangat Baik'
		when nilai >= 71 and nilai <= 84 then 'Kurang'
		when nilai >= 50 and nilai <= 70 then 'Gagal'
	end keterangan
from nilai;

select * from view_nilai vn;

select * from view_nilai vn where keterangan = 'Sangat Baik';



-- 2. mengubah kolom nama_dosen dengan tipe data varchar panjang 200 
alter table dosen alter column nama_dosen type varchar(200);

-- 3. 
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi as agama
from mahasiswa m 
join jurusan j on m.kode_jurusan = j.kode_jurusan 
join agama a on m.kode_agama = a.kode_agama 
where m.kode_mahasiswa = 'M001';

-- 4.
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
j.nama_jurusan,
j.status_jurusan
from mahasiswa m 
join jurusan j on m.kode_jurusan = j.kode_jurusan 
where j.status_jurusan = 'Non Aktif';

-- 5. 
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
n.nilai,
u.nama_ujian,
u.status_ujian 
from mahasiswa m 
join nilai n on m.kode_mahasiswa = n.kode_mahasiswa 
join ujian u on n.kode_ujian = u.kode_ujian 
where n.nilai > 80 and u.status_ujian = 'Aktif';

-- 6.
select * from jurusan where nama_jurusan ilike '%sistem%';

-- 7. 
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
count(n.kode_ujian) as total_ujian
from mahasiswa m 
join nilai n on m.kode_mahasiswa = n.kode_mahasiswa 
group by m.kode_mahasiswa, m.nama_mahasiswa 
having count(n.kode_ujian) > 1;

-- 8.
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi as agama,
d.nama_dosen,
j.status_jurusan,
td.deskripsi as deskripsi
from mahasiswa m 
join jurusan j on j.kode_jurusan = m.kode_jurusan 
join agama a on a.kode_agama = m.kode_agama 
join dosen d on d.kode_jurusan = j.kode_jurusan 
join type_dosen td on d.kode_type_dosen = td.kode_type_dosen
where m.kode_mahasiswa = 'M001';

--9. 
create view mahasiswa_view as
select 
m.kode_mahasiswa,
m.nama_mahasiswa,
j.nama_jurusan,
a.deskripsi as agama,
d.nama_dosen,
td.deskripsi as status
from mahasiswa m 
join jurusan j on j.kode_jurusan = m.kode_jurusan 
join agama a on a.kode_agama = m.kode_agama 
join dosen d on d.kode_jurusan = j.kode_jurusan 
join type_dosen td on d.kode_type_dosen = td.kode_type_dosen
where m.kode_mahasiswa = 'M001';

select * from mahasiswa_view;

-- 10.
select 
m.*,
n.nilai
from mahasiswa m 
left join nilai n on m.kode_mahasiswa = n.kode_mahasiswa;


select * from mahasiswa m ;







