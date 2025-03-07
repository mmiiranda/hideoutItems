import { CardItem } from "@/components/card/cardItem"

export default function Home(){
  const item = {id: 1, name: "douglas", imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLi_HguYoTIuH6mtavKgeQvdG3nIHDW8jyGA&s", date:new Date()}

  return(
    <div className="w-11/12">
        <h2 className="font-bold text-2xl">Items:</h2>
        <div className="grid grid-cols-1 sm:grid-cols-2  lg:grid-cols-3 xl:grid-cols-4 gap-12 mt-2">
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
          <CardItem id={item.id} name="oi" imgUrl={item.imgUrl} date={item.date} />
        </div>
    </div>
  )
} 