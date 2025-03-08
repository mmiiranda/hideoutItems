export default async function DetailItem({params}:{params: Promise<{id: number}>}){
    const {id} = await params

    const url = `https://jsonplaceholder.typicode.com/photos/${id}`
    const image = `https://picsum.photos/id/${id}/350`
    const response = await fetch(url).then(res => res.json())

    return (
        <div className="w-full flex flex-col lg:flex-row  justify-between gap-12 px-6">
            <div className="flex justify-center">
                <img src={image} alt="imga" />
            </div>
            <div>
                <h2 className="font-bold text-2xl">{response.title}</h2>

                <p className="mt-4">{response.title}</p>
            </div>
        </div>
    )
}